package net.jbock.cp;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import static com.fasterxml.jackson.annotation.PropertyAccessor.GETTER;

public class CopyFile {

  private static final ObjectWriter WRITER = new ObjectMapper()
      .setVisibility(GETTER, Visibility.ANY)
      .writerFor(Args.class);

  public static void main(String[] input) throws JsonProcessingException {
    Args args = Args_Parser.create().withIndent(2).parseOrExit(input);
    System.out.println(WRITER.writeValueAsString(args));
//    Files.copy(args.source(), args.dest());
  }
}
