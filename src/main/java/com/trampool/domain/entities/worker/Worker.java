package com.trampool.domain.entities.worker;

import java.util.List;

import com.trampool.domain.entities.PersonalData;

public class Worker {
    public PersonalData personalData;
    private List<WorkerCategory> workerCategories;
    
    public Worker(PersonalData personalData, List<WorkerCategory> workerCategories) {
        this.personalData = personalData;
    }

    public Worker(PersonalData personalData) {
        this.personalData = personalData;
    }

    public void addServiceCategory(WorkerCategory serviceCategory) {
        this.workerCategories.add(serviceCategory);
    }

    public List<WorkerCategory> getWorkerCategories() {
        return workerCategories;
    }
}

