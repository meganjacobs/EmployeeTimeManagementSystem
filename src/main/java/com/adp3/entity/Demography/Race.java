package com.adp3.entity.Demography;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gitRace {

    @Id
    private String id;
    private String description;

    private Race(){}

    private Race(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    public String getId() { return id; }

    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +;

    }

    public static class Builder {
        private String id, description;

        public Gender.Builder id(String id) {
            this.id = id;
            return this;

    }

    }
