package com.trampool.domain.usecases.validations;

import java.util.List;


public class PersonalDataPropertyValidator {
    List<ValidatorInterface> validations;

    public PersonalDataPropertyValidator(String property, List<ValidatorInterface> validations) throws ValidationException {
        if(validations.size() >= 1) {
            this.validations = validations;
            this.validate(property);
        }
    }

    public void validate(String property) throws ValidationException {
        this.validations.stream().forEach(validation -> {
            try {
                validation.validate(property);
            } catch (ValidationException e) {
               throw new RuntimeException(e);
            }
        });
    }
}
