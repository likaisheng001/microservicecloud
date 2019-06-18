package com.panda.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/6/18.
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
//        return new RandomRule(); //Ribbon默认是轮询，我自定义为随机
        return new RandomRule_LKS();
    }
}
