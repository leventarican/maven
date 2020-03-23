# demo for maven modularization
* parent module
* see also README's in child modules
* child modules will derive dependencies defined in parent (e.g. junit). 
    * no need to add that dependency in child pom.
* show jar content `jar -tf app.jar`
* build: `mvn clean package` will create two jar files (one uber jar with dependencies.