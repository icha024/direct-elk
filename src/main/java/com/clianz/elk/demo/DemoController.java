package com.clianz.elk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public static final Logger log = LoggerFactory.getLogger("DemoController");

    @GetMapping("/")
    public String hello() {
        log.info("Greetings!");
        return "hello";
    }
}
