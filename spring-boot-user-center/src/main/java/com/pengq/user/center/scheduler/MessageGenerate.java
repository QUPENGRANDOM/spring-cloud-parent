package com.pengq.user.center.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by pengq on 2019/11/11 16:01.
 */
@Configuration
public class MessageGenerate {
    private static final Logger logger = LoggerFactory.getLogger(MessageGenerate.class);

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    private AtomicInteger index = new AtomicInteger();

    @Scheduled(cron = "0 0/1 * * * ?")
    public void sendMessage() {
        logger.info("scheduled running...");
        simpMessagingTemplate.convertAndSend("/notice", index.getAndAdd(1));
    }
}
