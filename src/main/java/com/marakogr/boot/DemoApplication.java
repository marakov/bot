package com.marakogr.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		System.out.println(( (RestClient) context.getBean("restClient")).hello());
        SpringApplication.run(DemoApplication.class, args);

    }

    @Bean
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
    }
}
