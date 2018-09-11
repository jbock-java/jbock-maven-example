package net.jbock.cp;

public class CopyFile {

  public static void main(String[] input) {
    Args args = Args_Parser.create().parseOrExit(input);
    System.out.println(args);
//    Files.copy(args.source(), args.dest());
  }
}
