import graphviz
import xml.etree.ElementTree
import sys

print(sys.argv)
file_name=sys.argv[1]
output_dir=sys.argv[2]


import re

def use_regex(input_text):
    #pattern = re.compile(r"((.*) = (.* (.*\.)<|.*<)|.*<)[^ ]* ([^ ]*) ([^ ]*)\(.*\>(.*)", re.IGNORECASE)
    pattern = re.compile(r"((.*) = (.* (.*\.)<|.*<)|.*<)([^:]*): ([^ ]*) ([^ ]*)\(.*\>(.*)", re.IGNORECASE)
    return pattern.match(input_text)
def handle_statement(statement):
    t=use_regex(statement)
    if(t==None):
        ##print(statement + "XXXXXXX")
        return statement
    else:
        print(statement)
        ret=""
        if(t.group(2) != None):
            ret = ret + t.group(2) + " = "
        ret = ret + t.group(6) + " "
        if(t.group(4) != None):
            ret = ret + t.group(4)
        else:
            ret = ret + t.group(5)+"."
        return ret + t.group(7) + t.group(8)



tree = xml.etree.ElementTree.parse(file_name)
root = tree.getroot()
source_nr = 0
# Read all results
for result in root.findall('.//Results/Result'):    
    sink = result.findall('.//Sink')[0]
    sink_name = handle_statement(sink.attrib["Statement"])

    graph = graphviz.Digraph(format='svg',comment=sink_name)
    
    sink_line = sink.attrib["LineNumber"]
    graph.node(sink_line,'Line: '+sink_line+'\n'+sink_name,color="blue")
    j = 0
    for source in result.findall('.//Sources/Source'):
        source_id = j
        j = j + 1
        source_line = source.attrib['LineNumber']
        source_name = handle_statement(source.attrib["Statement"])
        i = 0
        for pathelement in source.findall('.//TaintPath/PathElement'):
            pathelement_id = i
            pathelement_name=handle_statement(pathelement.attrib["Statement"])
            i = i + 1
            ##print(pathelement.attrib["Statement"])
            node_id=str(source_id)+"_"+str(pathelement_id)
            if(pathelement_id>0):
                graph.node(node_id,pathelement_name,shape="box")
                graph.edge(old_node_id,node_id,label="")
            else:
                graph.node(node_id,'Line: '+source_line+"\n"+pathelement_name,color="red",shape="box")
            old_node_id=node_id
        graph.edge(node_id,sink_line,label="sinks through")
    graph.render(directory=output_dir,filename="TaintedPath_"+str(source_nr))
    source_nr = source_nr + 1
