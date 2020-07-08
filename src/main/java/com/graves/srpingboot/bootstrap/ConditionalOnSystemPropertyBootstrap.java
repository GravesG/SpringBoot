package com.graves.srpingboot.bootstrap;

import com.graves.srpingboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/8
 */
//@ConditionalOnSystemProperty(name = "user.name" , value = "ZeTao")
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "ZeTao")
    public String helloWorld() {
        return "Hello,World ZeTao";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        // 通过名称和类型获取 helloWorld Bean
        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean : " + helloWorld);

        // 关闭上下文
        context.close();

    }
}
