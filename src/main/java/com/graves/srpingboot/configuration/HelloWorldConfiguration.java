package com.graves.srpingboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/8
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        return "Hello,World 2018";
    }
}
