#!/usr/bin/env bash
MODULE_PATH=target/jbock-maven-example-0-SNAPSHOT.jar
for JAR in `find target/lib/ -name "*.jar"`; do
       MODULE_PATH="${MODULE_PATH}:${JAR}"
done
java --module-path $MODULE_PATH --module jbock.maven.example $@ 
