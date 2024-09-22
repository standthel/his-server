package com.his;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.annotation.ServletSecurity;

//@ServletSecurity
//过滤器使用 注解： @ServletComponentScan
@SpringBootApplication
public class HisServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisServerApplication.class, args);
    }

}
