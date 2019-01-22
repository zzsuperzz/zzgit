package com.tjhq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tjhq"})//自动扫描com.tjhq下所有注解为controller service repository文件
@MapperScan("com.tjhq")//自动扫描mapper文件
//在启动类当中加上extends SpringBootServletInitializer并重写configure方法，这是为了打包springboot项目用的。
public class EfmisApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EfmisApplication.class, args);
    }

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}

