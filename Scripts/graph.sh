#! /bin/sh

#Usage :
# Export these variables :
### OUTPUT_FOLDER     : Folder in which output files will be written to
### SOURCE_SINK_FILE  : text file containing the sources and sinks to be considered during flowdroid's analysis (based on Flowdroid's sources and sink text file)
### FLOWDROID_FOLDER  : Flowdroid folder
### APK               : APK to be analysed
### PLATFORMS         : Platforms folder of android sdk (Android studio creates a folder Android/Sdk/platforms link this folder)


#### TODO
#### Usage as a print
#### Take parameters and not only env variables
#### Allow for users to change variables in the flowdroid exec ? 



#### INPUT CHECKING

if test -z "$OUTPUT_FOLDER" 
then
      echo "OUTPUT_FOLDER not set : Defaulting to ."
      OUTPUT_FOLDER=.
else
      echo "OUTPUT_FOLDER set to $OUTPUT_FOLDER"
fi


if test -z "$SOURCE_SINK_FILE"
then
      echo "SOURCE_SINK_FILE not set exiting..."
      exit -4
else
      echo "SOURCE_SINK_FILE set to $SOURCE_SINK_FILE"
fi


if test -z "$FLOWDROID_FOLDER"
then
      echo "FLOWDROID_FOLDER not set : exiting..."
      exit -1
else
      echo "FLOWDROID_FOLDER set to $FLOWDROID_FOLDER"
fi


if test -z "$APK"
then
      echo "APK not set : exiting..."
      exit -2
else
      echo "APK set to $APK"
fi


if test -z "$PLATFORMS"
then
      echo "PLATFORMS not set : exiting..."
      exit -3
else
      echo "PLATFORMS set to $PLATFORMS"
fi


echo "\n"
###########


### Configuring

time=$(date +%d_%m_%Hh%M-%S)
dir=$time
out=$OUTPUT_FOLDER/$dir

log=Flowdroid.log
file_out=flow_out.xml
config='command.conf'

########


#### MAIN PROGRAM

echo "Creating output folder ($out)"
mkdir -p $out

echo "java -Xmx10000m -jar $FLOWDROID_FOLDER/soot-infoflow-cmd/target/soot-infoflow-cmd-jar-with-dependencies.jar -a $APK -p $PLATFORMS -s $SOURCE_SINK_FILE -ls -o $out/$file_out -d -pr PRECISE -i ALL -ol -on 2>$out/$log">$out/$config

echo "Finding flows via flowdroid..."
java -Xmx10000m -jar $FLOWDROID_FOLDER/soot-infoflow-cmd/target/soot-infoflow-cmd-jar-with-dependencies.jar -a $APK -p $PLATFORMS -s $SOURCE_SINK_FILE -ls -o $out/$file_out -d -pr PRECISE -i ALL -ol -on 2>$out/$log

echo "Generating graph..."
python3 Flowdroid_to_graph.py $out/$file_out $out

echo "Done generating"
#####
