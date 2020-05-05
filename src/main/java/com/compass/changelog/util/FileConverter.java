package com.compass.changelog.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileConverter {

  public static String convertToString(String fileName) {
    if (fileName == null) {
      throw new NullPointerException("Filename");
    }

    String markdown;
    try {
      markdown = Files.lines(Paths.get(fileName)).collect(Collectors.joining("\n"));
    } catch (IOException ex) {
      throw new RuntimeException("There was an error reading file");
    }

    return markdown;
  }
}
