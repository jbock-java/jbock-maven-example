package net.jbock.cp;

import net.jbock.CommandLineArguments;
import net.jbock.Parameter;
import net.jbock.PositionalParameter;

import java.nio.file.Path;
import java.util.Optional;


/**
 * Copy SOURCE to DEST
 */
@CommandLineArguments(
    programName = "cp",
    missionStatement = "copy files and directories")
abstract class Args {

  /**
   * Path or file of directory to copy
   *
   * @return SOURCE
   */
  @PositionalParameter
  abstract Path source();

  /**
   * Copy destination
   *
   * @return DEST
   */
  @PositionalParameter
  abstract Path dest();

  /**
   * Copy directories recursively
   */
  @Parameter(shortName = 'r')
  abstract boolean recursive();

  /**
   * Make a backup of each existing destination file
   */
  @Parameter(shortName = 'b', longName = "")
  abstract boolean backup();

  /**
   * Override the usual backup suffix
   */
  @Parameter(shortName = 's')
  abstract Optional<String> suffix();
}
