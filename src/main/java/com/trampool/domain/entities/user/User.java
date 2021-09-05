package com.trampool.domain.entities.user;

import com.trampool.domain.entities.PersonalData;

public class User {
    public PersonalData personalData;

    public User(PersonalData personalData) {        
        this.personalData = personalData;
    }
}