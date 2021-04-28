package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// main class
@SpringBootApplication  // 스프링부트 자동설정, 스프링Bean읽기와 생성 항상 최상단에 위치
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
