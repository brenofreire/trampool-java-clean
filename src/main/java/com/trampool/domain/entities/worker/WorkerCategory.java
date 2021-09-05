package com.trampool.domain.entities.worker;

import com.trampool.domain.entities.ServiceCategory;

public class WorkerCategory extends ServiceCategory {
    public String identifier;
    public String name;
    
    public WorkerCategory(String identifier, String name) {
        super(identifier, name);
    }    
}
