package com.graves.srpingboot.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/8
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> annotationAttributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(annotationAttributes.get("name"));
        String propertyValue = String.valueOf(annotationAttributes.get("value"));
        String property = System.getProperty(propertyName);
        return propertyValue.equals(property);
    }
}
