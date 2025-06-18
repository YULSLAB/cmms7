package com.example.cmms7.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "test")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String input1;
    private String input2;
    private String input3;
    private String input4;
    private String input5;

    @Column(columnDefinition = "TEXT")
    private String notes;
}
