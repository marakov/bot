package com.marakogr.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{

//    public static void main(String[] args) {
////		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
////		System.out.println(( (RestClient) context.getBean("restClient")).hello());
//        SpringApplication.run(DemoApplication.class, args);
//
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
    }
}
