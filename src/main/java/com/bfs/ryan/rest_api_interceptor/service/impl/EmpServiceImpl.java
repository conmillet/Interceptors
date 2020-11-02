package com.bfs.ryan.rest_api_interceptor.service.impl;

import com.bfs.ryan.rest_api_interceptor.dao.EmpRepo;
import com.bfs.ryan.rest_api_interceptor.model.Emp;
import com.bfs.ryan.rest_api_interceptor.service.EService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EService<Emp> {

    @Autowired
    private EmpRepo repo;

    @Override
    public Collection<Emp> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Emp> findById(int eid) {
        return repo.findById(eid);
    }

    @Override
    public Emp saveOrUpdate(Emp emp) {
        return repo.saveAndFlush(emp);
    }

    @Override
    public void deleteById(int eid) {
        repo.deleteById(eid);
    }
}
