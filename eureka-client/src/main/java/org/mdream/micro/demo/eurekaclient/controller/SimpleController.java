package org.mdream.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping("/mapping")
    public String simpleGetMapping() {
        return "simple controller";
    }
}
