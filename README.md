Example project for the [jbock](https://github.com/h908714124/jbock) annotation processor.

<pre><code>$ mvn clean package
$ java -jar target/cp.jar -r ~/Documents /media/archive 
{"source":"/home/alice/Documents", "dest":"/media/archive", "recursive":true}
$ java -jar target/cp.jar --help
</code></pre>

Or [compile to native](https://github.com/oracle/graal/releases) first:

````sh
mvn package
native-image --no-fallback -jar target/cp.jar cp
./cp -r ~/Documents /media/archive
./cp --help
````

