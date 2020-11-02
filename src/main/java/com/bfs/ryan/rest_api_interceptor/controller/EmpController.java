package com.bfs.ryan.rest_api_interceptor.controller;

import com.bfs.ryan.rest_api_interceptor.dao.EmpRepo;
import com.bfs.ryan.rest_api_interceptor.model.Emp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@RestController
public class EmpController {

    private static Logger log = LoggerFactory.getLogger(EmpController.class);

    @Autowired
    private EmpRepo repo;

    @RequestMapping("/")
    public String home() {
        log.info("Home Page...");
        return "home";
    }

    // Delete
    @DeleteMapping("/emps/{eid}")
    public String deleteEmp(@PathVariable int eid) {
        log.info("EmpController - DeleteById");
        Emp emp = repo.getOne(eid);
        repo.delete(emp);
        return "deleted";
    }

    // PUT
    @PutMapping(path = "/emp")
    public Emp saveOrUpdateEmp(@RequestBody Emp emp) {
        log.info("EmpController - Update");
        repo.save(emp);
        return emp;
    }


    // POST
    @PostMapping("/emp")
    public Emp addEmp(Emp emp) {
        log.info("EmpController - Post");
        repo.save(emp);
        return emp;
    }

    // GET BY ID
    @RequestMapping("/emps/{eid}")
    public Optional<Emp> getEmp(@PathVariable("eid") int eid) {
        log.info("EmpController - GetById");
        return repo.findById(eid);
    }

    // GET
    @GetMapping(path = "/emps")
    public List<Emp> getEmps() {
        log.info("EmpController - GetAll");
        return repo.findAll();
    }
}
