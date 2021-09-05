package com.trampool.domain.entities;

public class PersonalData {
    private Username username;
    private Password password;
    private String name;

    public PersonalData(Username username, Password password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Username getUsername() {
        return this.username;
    }

    public Password getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}
