package com.sjy.eduplatform.enroll.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : hechuansheng
 * @date : 2023/6/7 16:17
 * @since : version-1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.sjy.eduplatform.enroll"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
