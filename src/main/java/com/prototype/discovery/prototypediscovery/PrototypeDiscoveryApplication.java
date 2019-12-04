package com.prototype.discovery.prototypediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrototypeDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeDiscoveryApplication.class, args);
    }

}
