package com.graves.srpingboot.bootstrap;

import java.awt.Component;

import com.graves.srpingboot.respority.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/7
 */
@ComponentScan(basePackages = "com.graves.srpingboot.respority")
public class RepositoryBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        System.out.println("myFirstLevelRepository bean :" + myFirstLevelRepository);
        context.close();
    }
}
