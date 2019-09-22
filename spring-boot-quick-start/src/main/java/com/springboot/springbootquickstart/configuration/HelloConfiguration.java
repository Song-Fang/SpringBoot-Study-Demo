package com.springboot.springbootquickstart.configuration;

import com.springboot.springbootquickstart.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
