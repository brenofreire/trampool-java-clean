package com.trampool.domain.usecases.validations;

public class PasswordBaseValidator implements ValidatorInterface {
    public boolean validate (String password) throws ValidationException {            
        if(password.length() >= 6 && password.length() <= 32) {
            return true;
        } else {        
            throw new ValidationException("Invalid password");
        }
    }
}
