package com.example.cmms7.controller;

import com.example.cmms7.entity.TestEntity;
import com.example.cmms7.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class TestController {

    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @PostMapping
    public TestEntity save(@RequestBody TestEntity entity) {
        return service.save(entity);
    }

    @GetMapping
    public List<TestEntity> findAll() {
        return service.findAll();
    }
}
