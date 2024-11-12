package net.jbock.cp;

public class CopyFile {

    public static void main(String[] input) {
        Args args = ArgsParser.parseOrExit(input);
        System.out.println(args);
    }
}
