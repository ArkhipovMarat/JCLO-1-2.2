package com.example2.entity;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "name is empty")
    String name;
    @NotBlank(message = "password is empty")
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
