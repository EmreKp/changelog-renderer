package com.compass.changelog.util;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MarkdownConverter {

  public static String convertToHTML(String markdown) {
    Parser parser = Parser.builder().build();
    Node document = parser.parse(markdown);

    HtmlRenderer renderer = HtmlRenderer.builder().build();

    return renderer.render(document);
  }
}
