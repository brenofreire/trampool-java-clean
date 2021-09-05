package com.trampool.domain.usecases.factories;

import java.util.ArrayList;
import java.util.List;

import com.trampool.domain.entities.Password;
import com.trampool.domain.entities.PersonalData;
import com.trampool.domain.entities.Username;
import com.trampool.domain.entities.user.User;
import com.trampool.domain.usecases.validations.PasswordBaseValidator;
import com.trampool.domain.usecases.validations.UsernameBaseValidator;
import com.trampool.domain.usecases.validations.ValidationException;
import com.trampool.domain.usecases.validations.ValidatorInterface;

public class UserFactory {
    private User user;

    public UserFactory(String name, String username, String password) throws ValidationException {
        try {            
            List<ValidatorInterface> usernameValidations = new ArrayList<ValidatorInterface>();
            usernameValidations.add(new UsernameBaseValidator());
    
            List<ValidatorInterface> passwordValidations = new ArrayList<ValidatorInterface>();
            passwordValidations.add(new PasswordBaseValidator());
            
            Username workerUsername = new Username(username, usernameValidations);
            Password workerPassword = new Password(password, passwordValidations);    
            PersonalData personalData = new PersonalData(workerUsername, workerPassword, name);

            this.user = new User(personalData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public User create() {
        return this.user;
    }
}
