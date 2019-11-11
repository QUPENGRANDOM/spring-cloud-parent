package com.pengq.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by pengq on 2019/11/8 17:39.
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class SpringAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAdminServerApplication.class, args);
    }
}
