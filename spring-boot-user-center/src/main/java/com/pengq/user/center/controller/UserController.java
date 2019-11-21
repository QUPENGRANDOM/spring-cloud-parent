package com.pengq.user.center.controller;

import com.pengq.user.center.PlotProcessProperties;
import com.pengq.user.center.listener.PlotTaskFinishedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengq on 2019/11/21 8:41.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private PlotProcessProperties plotProcessProperties;

    @GetMapping(value = "/test")
    public String test() {
        PlotTaskFinishedEvent event = new PlotTaskFinishedEvent(1);
        applicationContext.publishEvent(event);
        System.out.println(plotProcessProperties);
        return "success";
    }
}
