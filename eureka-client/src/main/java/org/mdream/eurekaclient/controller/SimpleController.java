package org.mdream.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/simplemapping")
    public String simpleGetMapping() {
        return "simple controller";
    }
}
