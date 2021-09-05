package com.trampool.infra.models;

import java.util.Date;

import com.trampool.domain.entities.Password;
import com.trampool.domain.entities.Username;

public class UserAccount {
    private int id;
    private String name;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;    

    public UserAccount(String name, Username username, Password password) {
        this.name = name;
        this.username = username.toString();
        this.password = password.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
    public Date getUpdatedAt() {
        return updatedAt;
    }
}
