# jbock-maven-example

Add this to `pom.xml`:

````xml
<dependency>
  <groupId>io.github.jbock-java</groupId>
  <artifactId>jbock</artifactId>
  <version>5.0</version>
</dependency>
````

Then configure the annotation processor path:

````xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <configuration>
        <annotationProcessorPaths>
          <dependency>
            <groupId>io.github.jbock-java</groupId>
            <artifactId>jbock-compiler</artifactId>
            <version>5.0</version>
          </dependency>
        </annotationProcessorPaths>
      </configuration>
    </plugin>
  </plugins>
</build>
````

### Try it

````sh
./mvnw clean package
jpackage --name cp --type app-image --module-path `./get_module_path` --module jbock.maven.example/net.jbock.cp.CopyFile --dest target/out
./create_launcher_script >cp
chmod +x cp
./cp --help
````

### See also

* [jbock](https://github.com/jbock-java/jbock)
* [jbock-gradle-example](https://github.com/jbock-java/jbock-gradle-example)

