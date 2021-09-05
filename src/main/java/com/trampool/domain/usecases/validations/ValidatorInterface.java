package com.trampool.domain.usecases.validations;

public interface ValidatorInterface {
    boolean validate(String property) throws ValidationException;
}
