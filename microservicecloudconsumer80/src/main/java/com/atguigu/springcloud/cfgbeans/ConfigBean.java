package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/6/17.
 */
@Configuration
public class ConfigBean {//boot -->spring applicationContext.xml ---  @Configuration配置 ConfigBean = applicationContext.xml
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//@Bean
//public UserService getUserService(){
//}
//applicationContext.xml = Configuration(@Configuration)
//<bean id="userService" class="com.auguigu.tmall.UserServiceImpl"/>
