package com.pengq.user.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringUserCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringUserCenterApplication.class,args);
    }
}
