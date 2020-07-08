package com.graves.srpingboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/8
 */
@Profile("Java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7");
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            num += values[i];
        }
        return num;
    }
}
