package com.bfs.ryan.rest_api_interceptor.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Component
@Getter
@Setter
public class Emp {

    @Id
    private int eid;
    private String name;
    private String tech;

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    //    @Autowired // search by type
//    @Qualifier("lap1") // search by name
    //private Laptop laptop;

//    public void show() {
//        System.out.println("it works...");
//        laptop.compile();
//    }
}
