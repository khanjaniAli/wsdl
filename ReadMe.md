## wsdl to java

convert wsdl file to java file using jaxws-maven-plugin dependency.

### Usage

**Add dependency:**

```xml
<plugin>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-maven-plugin</artifactId>
    <version>4.0.2</version>
    <executions>
        <execution>
            <goals>
                <goal>wsimport</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <wsdlDirectory>${project.basedir}/src/main/java/ir/sdoc/wsdl/file/</wsdlDirectory>
        <packageName>ir.sdoc.wsdl.ws.web</packageName>
        <sourceDestDir>
            ${project.basedir}/src/main/java/ir/sdoc/wsdl/ws/
        </sourceDestDir>
    </configuration>
</plugin>
```
wsdlDirectory -> directory that contains wsdl files.
packageName -> ur project package name
sourceDestDir -> output directory (generated java classes directory)



for using run -> mvn clean install
or jaxws:wsimport