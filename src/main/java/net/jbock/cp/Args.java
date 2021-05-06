package net.jbock.cp;

import picocli.CommandLine;

import java.nio.file.Path;

/**
 * Copy SOURCE to DEST
 */
@CommandLine.Command(name = "cp")
class Args implements Runnable {

    /**
     * Path or file of directory to copy.
     * @return SOURCE
     */
    @CommandLine.Parameters(index = "0", description = {
            "Kids, I swear, I'm gonna love all of you,",
            "and equally. I'll be dividing my love",
            "into seven equal sections, or \"Love Quadrants\".",
            "Each quadrant will be worth 15 \"Love Units\"",
            "represented by these small brass marbles.",
            "You may use these marbles as currency amongst yourselves.",
            "Collect 35 \"Love Units\", you can trade those in for a",
            "beach towel with my face on it."})
    Path source;

    /**
     * Copy destination
     * @return DEST
     */
    @CommandLine.Parameters(index = "1", description = {
            "Kids, I swear, I'm gonna love all of you, " +
                    "and equally. I'll be dividing my love " +
                    "into seven equal sections, or \"Love Quadrants\". " +
                    "Each quadrant will be worth 15 \"Love Units\" " +
                    "represented by these small brass marbles. " +
                    "You may use these marbles as currency amongst yourselves. " +
                    "Collect 35 \"Love Units\", you can trade those in for a " +
                    "beach towel with my face on it."})
    Path dest;

    /**
     * Copy directories recursively
     */
    @CommandLine.Option(names = {"--recursive", "-r"})
    boolean recursive;

    /**
     * Make a backup of each existing destination file
     */
    @CommandLine.Option(names = {"--backup", "-b"})
    boolean backup;

    /**
     * Override the usual backup suffix
     */
    @CommandLine.Option(names = {"--suffix", "-s"})
    String suffix;

    @Override
    public void run() {
        System.out.println("running " + getClass().getName());
    }
}
