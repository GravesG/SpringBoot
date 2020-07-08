package com.graves.srpingboot.annotation;
import	java.awt.Component;
import java.lang.annotation.*;
import	java.util.Collections;

import com.graves.srpingboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldImportSelector.class)
//@Import(HelloWorldConfiguration.class)
public @interface EnambleHelloWorld {
}
