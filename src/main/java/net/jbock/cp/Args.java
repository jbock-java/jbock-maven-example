package net.jbock.cp;

import net.jbock.CommandLineArguments;
import net.jbock.Parameter;
import net.jbock.PositionalParameter;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * Copy SOURCE to DEST
 */
@CommandLineArguments(programName = "cp")
abstract class Args {

    /**
     * Path or file of directory to copy
     * @return SOURCE
     */
    @PositionalParameter(1)
    abstract Path getSource();

    /**
     * Copy destination
     * @return DEST
     */
    @PositionalParameter(2)
    abstract Path getDest();

    /**
     * Copy directories recursively
     */
    @Parameter(mnemonic = 'r', value = "recursive")
    abstract boolean isRecursive();

    /**
     * Make a backup of each existing destination file
     */
    @Parameter(mnemonic = 'b', value = "backup")
    abstract boolean isBackup();

    /**
     * Override the usual backup suffix
     */
    @Parameter(mnemonic = 's', value = "suffix")
    abstract Optional<String> getSuffix();


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",\n  ", "{\n  ", "\n}");
        Method[] methods = getClass().getSuperclass().getDeclaredMethods();
        for (Method method : methods) {
            if (Modifier.isAbstract(method.getModifiers())) {
                try {
                    joiner.add(method.getName() + ": " + method.invoke(this));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return joiner.toString();
    }
}
