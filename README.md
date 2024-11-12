# jbock-maven-example

Add this dependency:

````xml
<dependency>
  <groupId>io.github.jbock-java</groupId>
  <artifactId>jbock</artifactId>
  <version>5.19</version>
</dependency>
````

Then configure the annotation processor:

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
            <version>5.19</version>
          </dependency>
        </annotationProcessorPaths>
      </configuration>
    </plugin>
  </plugins>
</build>
````

Add this to `module-info.java`:

````java
requires net.jbock;
````

### Run it

````sh
./mvnw clean package
./mvnw dependency:copy-dependencies -DincludeScope=runtime
./cp --help
./cp 1 -s2 2
````

### See also

* [jbock](https://github.com/jbock-java/jbock)
* [jbock-gradle-example](https://github.com/jbock-java/jbock-gradle-example)

