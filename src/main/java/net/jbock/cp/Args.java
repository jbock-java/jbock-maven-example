package net.jbock.cp;

import com.beust.jcommander.Parameter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Args {

    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = {"-log", "-verbose"}, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run. This is where the fun begins.")
    private String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = false;

    @Parameter(names = "--help", help = true)
    boolean help;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",\n  ", "{\n  ", "\n}");
        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                joiner.add(field.getName() + ": " + field.get(this));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return joiner.toString();
    }
}
