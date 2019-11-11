package com.pengq.user.center.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengq on 2019/11/7 9:12.
 */
@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Value("${file.name}")
    private String name;

    @GetMapping(value = "/test")
    public String test() {
        return name;
    }
}
