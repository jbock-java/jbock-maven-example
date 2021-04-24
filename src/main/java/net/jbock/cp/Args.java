package net.jbock.cp;

import net.jbock.Command;
import net.jbock.Option;
import net.jbock.Param;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * Copy SOURCE to DEST
 */
@Command("cp")
abstract class Args {

    /**
     * Path or file of directory to copy
     * @return SOURCE
     */
    @Param(0)
    abstract Path getSource();

    /**
     * Copy destination
     * @return DEST
     */
    @Param(1)
    abstract Path getDest();

    /**
     * Copy directories recursively
     */
    @Option(value = "recursive", mnemonic = 'r')
    abstract boolean isRecursive();

    /**
     * Make a backup of each existing destination file
     */
    @Option(value = "backup", mnemonic = 'b')
    abstract boolean isBackup();

    /**
     * Override the usual backup suffix
     */
    @Option(value = "suffix", mnemonic = 's')
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
