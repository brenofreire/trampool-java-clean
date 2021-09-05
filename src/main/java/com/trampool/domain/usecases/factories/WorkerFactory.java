package com.trampool.domain.usecases.factories;

import com.trampool.domain.entities.user.User;
import com.trampool.domain.entities.worker.Worker;
import com.trampool.domain.usecases.validations.ValidationException;

public class WorkerFactory {
    private Worker worker;

    public WorkerFactory(String name, String username, String password) throws ValidationException {
        try {            
            User user = new UserFactory(name, username, password).create();

            this.worker = new Worker(user.personalData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Worker create() {
        return this.worker;
    }
}
