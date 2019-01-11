package com.tjhq.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tjhq"})//自动扫描com.tjhq.business下所有注解为controller service repository文件
@MapperScan("com.tjhq")//自动扫描mapper文件
public class EfmisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfmisApplication.class, args);
    }

}

