package com.adp3.entity.Demography;

import com.adp3.entity.standalone.Leave;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Gender{

    @Id
    private String id;
    private String description;

    private Gender(Builder builder){}

    protected Gender(Leave.Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    public String getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public static class Builder {
        private String id, description;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder description( String description){
            this.description = description;
            return this;
        }

        public Builder copy(Gender gender){
            this.id = gender.id;
            this.description = gender.description;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}

