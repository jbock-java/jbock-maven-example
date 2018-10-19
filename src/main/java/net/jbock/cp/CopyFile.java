package net.jbock.cp;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CopyFile {

  private static final ObjectMapper MAPPER = new ObjectMapper()
      .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.ANY);;

  public static void main(String[] input) throws JsonProcessingException {
    Args args = Args_Parser.create().parseOrExit(input);
    System.out.println(MAPPER.writerFor(Args.class).writeValueAsString(args));
//    Files.copy(args.source(), args.dest());
  }
}
