package com.graves.srpingboot.annotation;

import java.lang.annotation.*;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/7
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
