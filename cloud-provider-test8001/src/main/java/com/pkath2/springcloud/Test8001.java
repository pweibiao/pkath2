package com.pkath2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: pwb
 * @Description:
 * @Date: Created in 2022/1/18 22:59
 */
@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.pkath2")
//@ComponentScan(basePackages = {"com.pkath2"})
public class Test8001 {
    public static void main(String[] args) {
        SpringApplication.run(Test8001.class, args);
    }
}
