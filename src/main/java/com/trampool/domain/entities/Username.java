package com.trampool.domain.entities;

import java.util.List;

import com.trampool.domain.usecases.validations.PersonalDataPropertyValidator;
import com.trampool.domain.usecases.validations.ValidatorInterface;
import com.trampool.domain.usecases.validations.ValidationException;


public class Username {
    private String username;

    public Username(String username, List<ValidatorInterface> validations) throws ValidationException {
        new PersonalDataPropertyValidator(username, validations);

        this.username = username;
    }

    @Override
    public String toString() {
        return this.username;
    }
}