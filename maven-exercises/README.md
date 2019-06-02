# Readme first
This is a multi-module maven project that contains the following plugins:
1. CheckStyle in order to make sure that we follow the correct coding styling
2. SportBugs in order to catch common pitfalls
3. Jacoco for Code Coverage reporting

## Project Structure and dependencies and plugins definitions
At the root of the project there is a central pom.xml file that references all 
the required modules (modules tag). Each module is under a separate folder and
contains its own pom.xml file that defines the *parent* module. 

The **dependencyManagement** tag defines dependencies that a module *could* 
depend on. We specify the version centrally in order to have better control. 
The submodules do NOT have to redefine the version number although it is possible
to override the version and generally any parent's default (plugin or dependency) 
configuration.

The submodules will inherit all the dependencies that the central *dependencies*
tag defines inside the central pom.xml file. Similar behavior exists for the 
*plugins* and *pluginManagement* tags.

### Step by step instructions
1. Run `mvn install` from the root folder. Notice that the system executes 
the compiles the sources, executes the checkstyle, spotbugs and jacoco plugins. 
You must see a a brief successful report at the end. 
2. Run `mvn install:help`, `mvn checkstyle:help`, `mvn jacoco:help`, `mvn spotbugs:help` 
in order to read more information about the plugins defined goals.
3. You could run `mvn jacoco:report-aggregate` in order to produce the jacoco-aggregated 
report but this step has been already executed with the previous `install`. 
Go under the folder <root folder>/testing/target/site/jacoco-aggregate and 
open the `index.html`. You will see the code coverage report for all the modules.
You could drill down and see what is not tested and any missed branches.
4. Run `mvn checkstyle:checkstyle-aggregate` and check the report under the 
<root folder>/target/site/checkstyle-aggregate.html
5. Open a Java class under the common module and remove the opening curly brace ({)
from the constructor. Insert the opening curly brace at a new line. This will raise
a checkstyle warning.
6. Re-run the `mvn checkstyle:checkstyle-aggregate` and check the new report. 
You must see the new introduced warning.
7. Correct all checkstyle warnings. 
8. Configure the Jacoco plugin in the main `pom.xml` in such a way that will stop
the compilation of a module if the line test code coverage is under 80%.
9. make the tests for the `common` module to be under the acceptable threshold.
10. Run `mvn verify`. What do you notice?
11. Run `mvn verify -fae`. What do you notice?
12. Run `mvn verify -fn`. What do you notice?
13. Edit the `Greeting` java fie under the `common` module and enter the 
`implements Cloneable` without actually overriding and implementing the clone method.
14. Run `mvn install`. Notice that the build failed for te `common` module due to the 
spotbugs plugin. It reports that 1 bug has been found.
15. Run `mvn spotbugs:gui -pl common`.
16. Notice the bug report and fix it.
17. Check all the SpotBugs descriptions (https://spotbugs.readthedocs.io/en/stable/bugDescriptions.html).
18. Run the application by typing `mvn spring-boot:run -pl web`
19. Open a browser and enter the following url: `http://localhost:8080/greeting?name=Code.Hub`

All the plugins can be easily integrated in almost any common IDE.
