# jbock-maven-example

[![core](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock/badge.svg?style=plastic&subject=jbock)](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock)
[![annotations](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock-annotations/badge.svg?color=red&style=plastic&subject=jbock-annotations)](https://maven-badges.herokuapp.com/maven-central/com.github.h908714124/jbock-annotations)

The annotations are not needed at runtime, so the scope can be `optional`
or `provided`.

````xml
<dependency>
  <groupId>com.github.h908714124</groupId>
  <artifactId>jbock-annotations</artifactId>
  <version>3.6</version>
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
            <version>3.6.001</version>
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
