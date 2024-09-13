package com.btea;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.btea.mapper")
@SpringBootApplication
public class AuroraWebsiteRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuroraWebsiteRegisterApplication.class, args);
    }
}
