package com.example.cmms7.service;

import com.example.cmms7.entity.TestEntity;
import com.example.cmms7.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    public TestEntity save(TestEntity entity) {
        return repository.save(entity);
    }

    public List<TestEntity> findAll() {
        return repository.findAll();
    }
}
