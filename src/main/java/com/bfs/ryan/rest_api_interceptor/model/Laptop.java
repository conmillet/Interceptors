package com.bfs.ryan.rest_api_interceptor.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("lap1")
@Setter
@Getter
public class Laptop {
    private int lid;
    private String brand;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile() {
        System.out.println("compiling...");
    }
}
