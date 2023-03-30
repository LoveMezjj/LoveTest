package com.shopping.boott005;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shopping")
@MapperScan("com.shopping.mapper")
public class BootT005Application {

    public static void main(String[] args) {
        SpringApplication.run(BootT005Application.class, args);
    }

}
