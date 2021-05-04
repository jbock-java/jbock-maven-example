package net.jbock.cp;

import org.jline.terminal.TerminalBuilder;

import java.io.IOException;

public class CopyFile {

    public static void main(String[] input) throws IOException {
        int width = TerminalBuilder.terminal().getWidth();
        Args args = new Args_Parser()
                .withTerminalWidth(width)
                .parseOrExit(input);
        System.out.println(args);
    }
}
