# jbock-maven-example

The annotations are not needed at runtime, so the scope can be `optional`
or `provided`.

````xml
<dependency>
  <groupId>com.github.h908714124</groupId>
  <artifactId>jbock-annotations</artifactId>
  <version>4.4</version>
  <optional>true</optional>
</dependency>
````

[jbock](https://github.com/jbock-java/jbock)
is an annotation processor, so it is needed
on the compiler classpath:

````xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <configuration>
        <annotationProcessorPaths>
          <dependency>
            <groupId>com.github.h908714124</groupId>
            <artifactId>jbock</artifactId>
            <version>4.4.000</version>
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

* [jbock](https://github.com/h908714124/jbock)
* [jbock-gradle-example](https://github.com/h908714124/jbock-gradle-example)

