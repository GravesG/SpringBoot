package com.graves.srpingboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Graves
 * @DESCRIPTION
 * @create 2020/7/8
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {

    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java8");
        int num = Arrays.stream(values).reduce(0,Integer::sum);
        return num;
    }
}
