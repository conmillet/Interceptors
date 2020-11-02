package com.bfs.ryan.rest_api_interceptor.service;

import com.bfs.ryan.rest_api_interceptor.model.Emp;

import java.util.Collection;
import java.util.Optional;

public interface EService<T> {

    Collection<T> findAll();

    Optional<T> findById(int eid);

    T saveOrUpdate(T t);

    void deleteById(int eid);
}
