package com.trampool.domain.usecases.validations;

public class UsernameBaseValidator implements ValidatorInterface {
    String username;
    String regexUsername = "^[a-zA-Z0-9._-]{3,32}$";

    public boolean validate (String username) throws ValidationException {
        this.username = username;

        if(username.matches(this.regexUsername)) {
            return true;
        }

        throw new ValidationException("Invalid username");
    }
}
