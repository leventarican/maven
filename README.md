# maven archetype for a java ee 7 web app
* depedencies: java ee 7 and junit

# based on
* https://maven.apache.org/archetypes/maven-archetype-archetype/
* https://maven.apache.org/guides/mini/guide-creating-archetypes.html
* https://github.com/AdamBien/javaee7-essentials-archetype

# howto use
1. git clone this maven project then install it to your local repository. later 'maybe' it will be available in remote maven repository.
```
mvn install
```
2. then generate your project based on the archetype. change groupId / artifactId if you want
```
mvn archetype:generate -DarchetypeGroupId=com.github.leventarican -DarchetypeArtifactId=javaee7-code -DarchetypeVersion=0.0.1 -DgroupId=com.github.leventarican -Dversion=0.0.1 -DartifactId=code
```
3. read to run / test it
```
mvn test
```
