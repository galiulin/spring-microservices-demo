package org.mdream.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class Example {

    @GetMapping("/first")
    public String take() {
        return "hello";
    }
}
