package net.jbock.cp;

import com.beust.jcommander.JCommander;

public class CopyFile {

    public static void main(String[] args) {
        Args jct = new Args();
        JCommander jCommander = JCommander.newBuilder()
                .addObject(jct)
                .build();
        jCommander.parse(args);

        if (jct.help) {
            jCommander.usage();
            return;
        }
        System.out.println(jct);
    }
}
