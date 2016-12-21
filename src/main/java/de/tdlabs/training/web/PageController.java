package de.tdlabs.training.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui")
class PageController {

  @GetMapping("/")
  String index() {
    return "index";
  }

  @GetMapping("/page1")
  String page1() {
    return "page1";
  }

  @GetMapping("/page2")
  String page2() {
    return "page2";
  }

  @GetMapping("/register")
  String registration() {
    return "registration/register";
  }
}
