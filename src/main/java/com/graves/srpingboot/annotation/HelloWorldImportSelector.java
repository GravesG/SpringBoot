package com.graves.srpingboot.annotation;
import	java.awt.Component;

import com.graves.srpingboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/8
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
