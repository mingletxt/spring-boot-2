package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BootApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
    
    @Bean
    public TomcatServletWebServerFactory servletContainer(){
        return new TomcatServletWebServerFactory(9999) ;
    }
    
}
