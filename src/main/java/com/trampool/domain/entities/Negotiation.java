package com.trampool.domain.entities;

import java.util.Date;

import com.trampool.domain.entities.user.User;
import com.trampool.domain.entities.worker.Worker;

public class Negotiation {
    private User user;
    private Worker worker;
    private Date date;
    private ServiceCategory serviceCategory;
    private int identifier;

    public Negotiation(User user, Worker worker, ServiceCategory serviceCategory) {
        this.user = user;
        this.worker = worker;
        this.date = new Date();
        this.serviceCategory = serviceCategory;
        this.identifier = this.generateIdentifier();
    }

    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public Worker getWorker() {
        return worker;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public int getIdentifier() {
        return identifier;
    }

    private int generateIdentifier() {
        String userUsername = this.user.personalData.getUsername().toString();
        String workerUsername = this.worker.personalData.getUsername().toString();

        return new String(userUsername + workerUsername + this.date.toString()).hashCode();
    }
}
