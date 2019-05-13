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
  abstract Path getSource();

  /**
   * Copy destination
   *
   * @return DEST
   */
  @PositionalParameter(position = 1)
  abstract Path getDest();

  /**
   * Copy directories recursively
   */
  @Parameter(shortName = 'r', longName = "recursive")
  abstract boolean isRecursive();

  /**
   * Make a backup of each existing destination file
   */
  @Parameter(shortName = 'b', longName = "backup")
  abstract boolean getBackup();

  /**
   * Override the usual backup suffix
   */
  @Parameter(shortName = 's', longName = "suffix")
  abstract Optional<String> getSuffix();
}
