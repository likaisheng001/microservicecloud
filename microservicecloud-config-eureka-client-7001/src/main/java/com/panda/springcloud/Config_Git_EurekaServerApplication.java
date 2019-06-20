package com.panda.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2019/6/20.
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication.class,args);
    }
}
