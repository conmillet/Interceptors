package com.bfs.ryan.rest_api_interceptor.dao;

import com.bfs.ryan.rest_api_interceptor.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
