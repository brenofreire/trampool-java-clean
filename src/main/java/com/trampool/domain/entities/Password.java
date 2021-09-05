package com.trampool.domain.entities;

import java.util.List;

import com.trampool.domain.usecases.validations.PersonalDataPropertyValidator;
import com.trampool.domain.usecases.validations.ValidatorInterface;
import com.trampool.domain.usecases.validations.ValidationException;


public class Password {
    private String password;

    public Password(String password, List<ValidatorInterface> validations) throws ValidationException {
        new PersonalDataPropertyValidator(password, validations);

        this.password = password;
    }

    @Override
    public String toString() {
        return this.password;
    }
}
