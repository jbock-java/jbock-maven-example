package net.jbock.cp;

import net.jbock.Command;
import net.jbock.Option;
import net.jbock.Parameter;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * Copy SOURCE to DEST
 */
@Command(name = "cp")
abstract class Args {

    /**
     * Path or file of directory to copy.
     * @return SOURCE
     */
    @Parameter(index = 0)
    abstract Path source();

    /**
     * Copy destination
     * @return DEST
     */
    @Parameter(index = 1)
    abstract Path dest();

    /**
     * Copy directories recursively
     */
    @Option(names = {"--recursive", "-r"})
    abstract boolean recursive();

    /**
     * Make a backup of each existing destination file
     */
    @Option(names = {"--backup", "-b"})
    abstract boolean backup();

    /**
     * Override the usual backup suffix
     */
    @Option(names = {"--suffix", "-s"})
    abstract Optional<String> suffix();
}
