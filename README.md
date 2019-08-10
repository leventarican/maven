# maven modules
* example: `/modules`

# maven archetype for a java ee 7 web app
* depedencies: java ee 7 and junit

## based on
* https://maven.apache.org/archetypes/maven-archetype-archetype/
* https://maven.apache.org/guides/mini/guide-creating-archetypes.html
* https://github.com/AdamBien/javaee7-essentials-archetype

## howto use
1. git clone this maven project then install it to your local repository. later 'maybe' it will be available in remote maven repository.
```
cd javaee7-archetype
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
## app structure 
```
¦   .gitignore
¦   pom.xml
¦   README.md
¦
+---src
    +---main
    ¦   +---java
    ¦   ¦   +---com
    ¦   ¦       +---github
    ¦   ¦           +---leventarican
    ¦   ¦                   ApiConfiguration.java
    ¦   ¦
    ¦   +---webapp
    ¦       ¦   index.html
    ¦       ¦
    ¦       +---WEB-INF
    ¦               beans.xml
    ¦
    +---test
        +---java
            +---com
                +---github
                    +---leventarican
                            AppTest.java
```

# cheatsheet
* list dependencies
```
mvn dependency:tree

...
[INFO] +- javax:javaee-api:jar:7.0:provided
[INFO] |  \- com.sun.mail:javax.mail:jar:1.5.0:provided
[INFO] |     \- javax.activation:activation:jar:1.1:compile
[INFO] +- junit:junit:jar:4.11:test
[INFO] |  \- org.hamcrest:hamcrest-core:jar:1.3:test
...
```

* show unused dependencies
```
mvn dependency:analyize

...
[INFO] --- maven-dependency-plugin:2.8:analyze (default-cli) @ dependencies-example ---
[WARNING] Unused declared dependencies found:
[WARNING]    junit:junit:jar:4.11:test
[WARNING]    com.microsoft.azure:azure-core:jar:0.9.8:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
...
```

* show plugin help / info
```
mvn help:describe -Dplugin=clean
```
