package com.panda.springcloud;

import com.panda.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2019/6/17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.panda.springcloud"})
@ComponentScan("com.panda.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
