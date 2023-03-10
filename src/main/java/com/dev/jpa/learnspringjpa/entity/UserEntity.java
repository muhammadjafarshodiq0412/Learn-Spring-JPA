package com.dev.jpa.learnspringjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "USER")
public class UserEntity {
    @Id
    private Long id;
    private String username;
    private Boolean isActived;
    private Long role;
    private Date createdDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;
}
