package net.jbock.cp;

import java.util.Optional;
import net.jbock.CommandLineArguments;
import net.jbock.Description;
import net.jbock.LongName;
import net.jbock.Positional;
import net.jbock.ShortName;

public class CopyFile {

  @CommandLineArguments(
      programName = "cp",
      missionStatement = "copy files and directories",
      overview = "Copy SOURCE to DEST")
  abstract static class Args {
    @Positional abstract String source();
    @Positional abstract String dest();

    @ShortName('r')
    @Description("copy directories recursively")
    abstract boolean recursive();

    @ShortName('b') @LongName("")
    @Description("make a backup of each existing destination file")
    abstract boolean backup();

    @ShortName('S')
    @Description("override the usual backup suffix")
    abstract Optional<String> suffix();
  }

  public static void main(String[] args) {
    Optional<Args> opt = CopyFile_Args_Parser.parse(args, System.err);
    if (!opt.isPresent()) {
      System.exit(1);
    }
    opt.ifPresent(CopyFile::run);
  }

  private static void run(Args args) {
    System.out.println(args);
  }
}
