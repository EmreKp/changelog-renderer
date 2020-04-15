package com.compass.changelog.controller;

import com.compass.changelog.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  private final MainService service;

  @Autowired
  public MainController(MainService service) {
    this.service = service;
  }

  @GetMapping(value = "/changelog", produces = "text/html;charset=UTF-8")
  public String invoke(@RequestParam(defaultValue = "CHANGELOG.md") String fileName) {
    return service.handle(fileName);
  }
}
