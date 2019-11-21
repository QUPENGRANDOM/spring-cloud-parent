package com.pengq.user.center.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by pengq on 2019/11/21 10:35.
 */
@Component
public class PlotTaskFinishedListener implements ApplicationListener<PlotTaskFinishedEvent> {
    private static final Logger log = LoggerFactory.getLogger(PlotTaskFinishedListener.class);
    @Override
    public void onApplicationEvent(PlotTaskFinishedEvent plotTaskFinishedEvent) {
        log.info("事件触发，{}",plotTaskFinishedEvent.getSource());
    }
}
