package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                "com.customer",
                "com.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.clients"
)
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}


//http://localhost:15672/#/
//http://localhost:5050/browser/
//http://localhost:8761/
//http://127.0.0.1:9411/zipkin/