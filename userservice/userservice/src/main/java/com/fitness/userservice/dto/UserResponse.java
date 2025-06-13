package com.fitness.userservice.dto;



import lombok.Data;

import java.time.LocalDateTime;
@Data
public class UserResponse {

    private  String id;
    private  String email;
    private  String password;
    private  String firstName;
    private  String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updateDat;

    public UserResponse() {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.updateDat = updateDat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName(String firstName) {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreatedAt(LocalDateTime createdAt) {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateDat(LocalDateTime updatedAt) {
        return updateDat;
    }

    public void setUpdateDat(LocalDateTime updateDat) {
        this.updateDat = updateDat;
    }
}

