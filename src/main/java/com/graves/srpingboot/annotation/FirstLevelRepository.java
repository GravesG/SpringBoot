package com.graves.srpingboot.annotation;

/**
 * @author Graves
 * @DESCRIPTION 派生性
 * @create 2020/7/7
 */

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 一级 {@link Repository @Repository}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
    String value() default "";
}
