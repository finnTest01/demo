package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class SpringbootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerApplication.class, args);
    }

    @GetMapping("/{name}")
    public String hi(@PathVariable( value = "name") String name) throws UnknownHostException {
        
        String hostName = InetAddress.getLocalHost().getHostName();

        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world444");
        return "hi," + name + "hostname:" + hostName;
    }

}
