package com.dev.jpa.learnspringjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "USER")
public class UserEntity {
    @Id
    private Long id;
    private String username;
}
