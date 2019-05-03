package net.jbock.cp;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

import java.io.IOException;

import static com.fasterxml.jackson.annotation.PropertyAccessor.GETTER;

public class CopyFile {

  private static final ObjectWriter WRITER = new ObjectMapper()
      .setVisibility(GETTER, Visibility.ANY)
      .registerModule(new Jdk8Module())
      .writerWithDefaultPrettyPrinter();

  public static void main(String[] input) throws IOException {
    Args args = Args_Parser.create().withIndent(2).parseOrExit(input);
    WRITER.writeValue(System.out, args);
  }
}
