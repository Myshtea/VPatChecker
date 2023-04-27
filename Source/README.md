# Repository of the source code of the contribution

## Author(s)

- Adwan Abdallah 
- -> Base theory and work of generator and CDL+CDML
- Ivan Baheux 
- -> Large part of "generator"'s code, changes of CDL+CDML and VPAT + VPATChecker


## How to install 

### Setup used to install :

- OS : debian-11.6.0-i386-netinst 
- VirtualBox Version 6.1.40\_Debian r154048 (though I'd recomment using a normal install, not a virtual box)
- For VBox : Ram = 2048M - Memory = 32G - Rest of install is default (Even GNOME)
- Eclipse version used : https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-ide-java-and-dsl-developers
- Java version 17.0.5.v20221102-0933
- Music I listened to during install : Cumbia Sobre el Mar, Quantic
- Commit used : 49b7a937c5175f393ed2614a50f0e602e63397fa

### <ins>Installation</ins>

- Clone the repository (Rest of installation will be on "main" branch)
- Install eclipse for java and DSL developers : https://www.eclipse.org/downloads/packages/installer
- Import main repository folder in eclipse (or import each part separately)


#### Install VPAT
VPAT - (DSL for pattern definition) - Depends on : Nothing outside of eclipse for DSL developers
- Right click fr.lcis.castav.vpat.parent -> run as.. -> maven build -> goals=clean install
- Note : Sometimes eclipse doesn't update itself when building the jar file and thus will not be detected by generator. When this happens just righ click -> refresh the dsl's target folder (fr.lcis.castav.vpat/target)
- To check install : No errors; Right click fr.lcis.castav.vpat -> run as ... -> Eclipse application
- Here you should be able to create a .vpat file and have a parser following the language
- Mind that if you already launched another eclipse application before (for another dsl for example), the run as... command will launch the same again. To avoid this you can do "run configuration..." and configure it yourself.

#### Install VpatChecker
VpatChecker - (Tool for finding vulnerabilities through tests and patterns) - Depends on : VPAT
- Install VPAT 
- Update src/main/ressources/config/config.xml with new values
- Now you can launch vpatchecker (if you put xml tests)

#### Install CDL + CDML
CDL - (DSL for context definition) - Depends on : Nothing outside of eclipse for DSL developers
CDML - (DSL for android application definition) - Depends on : Nothing outside of eclipse for DSL developers
- Right click fr.lcis.castav.cdl.parent -> run as.. -> maven build -> goals=clean install
- Note : Sometimes eclipse doesn't update itself when building the jar file and thus will not be detected by generator. When this happens just righ click -> refresh the dsl's target folder (fr.lcis.castav.cdl/target)
- To check install : No errors; Right click fr.lcis.castav.cdl -> run as ... -> Eclipse application
- Here you should be able to create a .vpat file and have a parser following the language
- Mind that if you already launched another eclipse application before (for another dsl for example), the run as... command will launch the same again. To avoid this you can do "run configuration..." and configure it yourself.
- Repeat with CDML

#### Install ConTest
ConTest - (Tool to generate behavioural tests) - Depends on : CDL + CDML
- Install CDL+CDML
- Update src/main/ressources/config/config.xml with new values
- Note : Please create a temp folder if it isn't already, else the program will crash. (I could just push it in the git repo but I am currently working on the installation guide)
- Now you should be able to launch generator

### <ins>Errors on install </ins>

#### JavaSE-19 and tycho problems
At the time of writing this, tycho is not compatible with JavaSE-19.
In order to complete the install, please use JavaSE-17 (Check Setup to see precise version used).
If everything goes right, this bug is not existent anymore

#### Installing a DSL
Sometimes when installing a DSL we have errors on the generated java files along the lines of "import cannot be resolved"
To avoid this, you can start the install from the maven clean or do "project -> clean...".
This problem comes from Eclipse hating itself.


### <ins>Testing the project</ins>

I pushed a few examples of .cdl and .cdml files in "generator/src/main/ressources"
Follow the following list to go from model to test :
- Change "generator/src/main/ressources/config/config.xml" so that it points to the afore mentioned .cdl and .cdml files
- Create folder generator/temp if it does not exist (I should really just push it or make it be created dynamically, it's like 1 loc but I'm lazy)
- Execute generator main App -> This should give you .xml tests in "generator/temp"
- Update "vpatchecker/src/main/ressources/config/config.xml" so that it points to the generated tests + the pattern folder + the output folder
- You should have the .xml files in the output folder you gave

### <ins>Using the project</ins>

First, I would recommend reading whatever report on this master's thesis you have.
Second, here is a resume of the project :
- The project is separated into two parts : Generation of tests following a coverage criteria ; Generation of exploit
- The generation of tests uses two DSL : CDL - A language that defines the values of dynamic context an application can have ; CDML - A modeling language we defined (more details in report)

Steps of usage 
- Create an Application
- Build the model of this application using the parser of CDML (right click CDML -> run as... -> eclipse application ; then create a .cdml file )
- Optional : Update the .cdl file (This one doesn't need 20 version, a really large one could be built as a side project)
- Generate the tests following a specific coverage criteria (Check code to see which ones are implemented, as of writing this only AllTransitions&AllSituations) (Think of updating the config.xml in ressources)
- Optional : Create patterns of vulnerabilities .vpat files; You can create more patterns and add them to the folder in vpatchecker (again use the vpat parser)
- Generate the exploits using vpatchecker. (Think of updating the config.xml in ressources)


