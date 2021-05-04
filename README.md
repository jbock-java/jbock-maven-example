# jbock-maven-example

The annotations are not needed at runtime, so the scope can be `optional`
or `provided`.

````xml
<dependency>
  <groupId>com.github.h908714124</groupId>
  <artifactId>jbock-annotations</artifactId>
  <version>4.0</version>
  <optional>true</optional>
</dependency>
````

[jbock](https://github.com/h908714124/jbock)
is an annotation processor, so it is only needed
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
            <version>4.0.000</version>
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
java -jar target/cp.jar -r ~/Documents /media/archive
````
