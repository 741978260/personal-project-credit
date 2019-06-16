package com.mumu.customercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CreditServerWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditServerWebappApplication.class, args);
    }

}
