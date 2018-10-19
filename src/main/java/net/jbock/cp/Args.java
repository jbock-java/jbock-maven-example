package net.jbock.cp;

import com.fasterxml.jackson.annotation.JsonGetter;
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
  @JsonGetter
  @PositionalParameter
  abstract Path source();

  /**
   * Copy destination
   *
   * @return DEST
   */
  @JsonGetter
  @PositionalParameter(position = 1)
  abstract Path dest();

  /**
   * Copy directories recursively
   */
  @JsonGetter
  @Parameter(flag = true, shortName = 'r')
  abstract boolean recursive();

  /**
   * Make a backup of each existing destination file
   */
  @JsonGetter
  @Parameter(flag = true, shortName = 'b')
  abstract boolean backup();

  /**
   * Override the usual backup suffix
   */
  @JsonGetter
  @Parameter(optional = true, shortName = 's')
  abstract Optional<String> suffix();
}
