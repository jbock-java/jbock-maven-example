package net.jbock.cp;

import net.jbock.Command;
import net.jbock.Option;
import net.jbock.Parameter;

import java.nio.file.Path;
import java.util.Optional;

/**
 * Copy SOURCE to DEST
 */
@Command(name = "cp")
interface Args {

    /**
     * Path or file of directory to copy.
     * @return SOURCE
     */
    @Parameter(index = 0)
    Path source();

    /**
     * Copy destination
     * @return DEST
     */
    @Parameter(index = 1)
    Path dest();

    /**
     * Copy directories recursively
     */
    @Option(names = {"--recursive", "-r"})
    boolean recursive();

    /**
     * Make a backup of each existing destination file
     */
    @Option(names = {"--backup", "-b"})
    boolean backup();

    /**
     * Override the usual backup suffix
     */
    @Option(names = {"--suffix", "-s"})
    Optional<String> suffix();
}
