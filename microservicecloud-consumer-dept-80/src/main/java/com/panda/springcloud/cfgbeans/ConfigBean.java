package com.panda.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/6/17.
 */
@Configuration
public class ConfigBean {//boot -->spring applicationContext.xml ---  @Configuration配置 ConfigBean = applicationContext.xml
    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @Bean
    public IRule myRule(){
//        return new RandomRule(); //达到的目的，用我们重新选择的随机算法替代默认的轮询
        return  new RetryRule();
    }
}
//@Bean
//public UserService getUserService(){
//}
//applicationContext.xml = Configuration(@Configuration)
//<bean id="userService" class="com.panda.tmall.UserServiceImpl"/>
