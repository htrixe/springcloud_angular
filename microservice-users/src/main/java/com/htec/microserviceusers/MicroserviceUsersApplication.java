package com.htec.microserviceusers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute
@EnableEurekaClient
@EntityScan({"com.htec.commonsstudents.models.entity"})
public class MicroserviceUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceUsersApplication.class, args);
    }

}
