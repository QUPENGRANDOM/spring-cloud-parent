package com.pengq.user.center.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by pengq on 2019/11/21 10:33.
 */
public class PlotTaskFinishedEvent extends ApplicationEvent {
    public PlotTaskFinishedEvent(Object source) {
        super(source);
    }
}
