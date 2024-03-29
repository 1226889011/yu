package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
1、将服务提供者注册到注册中心
    1、引入dubbo和zkclient相关依赖
    2、配置dubbo的扫描包和地址到注册中心
    3、使用@service发布服务
 */
@SpringBootApplication
public class TicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketsApplication.class, args);
    }

}
