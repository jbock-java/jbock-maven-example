package net.jbock.cp;

import org.jline.terminal.TerminalBuilder;
import picocli.CommandLine;

import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        int width = TerminalBuilder.terminal().getWidth();
        int exitCode = new CommandLine(new Args())
                .setUsageHelpWidth(width)
                .execute(args);
        System.exit(exitCode);
    }
}
