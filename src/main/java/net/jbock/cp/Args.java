package net.jbock.cp;

import net.jbock.CommandLineArguments;
import net.jbock.Description;
import net.jbock.LongName;
import net.jbock.Positional;
import net.jbock.ShortName;

import java.nio.file.Path;
import java.util.Optional;

@CommandLineArguments(
    programName = "cp",
    missionStatement = "copy files and directories",
    overview = "Copy SOURCE to DEST")
abstract class Args {

  @Positional
  @Description("Path or file of directory to copy")
  abstract Path source();

  @Positional
  @Description("Copy destination")
  abstract Path dest();

  @ShortName('r')
  @Description("copy directories recursively")
  abstract boolean recursive();

  @ShortName('b')
  @LongName("")
  @Description("make a backup of each existing destination file")
  abstract boolean backup();

  @ShortName('S')
  @Description("override the usual backup suffix")
  abstract Optional<String> suffix();
}
