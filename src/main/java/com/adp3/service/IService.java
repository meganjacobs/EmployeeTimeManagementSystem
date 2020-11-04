package com.adp3.service;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Factory: Main IService created with CRUD method commonality containing business logic and validation
 */

public interface IService <Type, ID> {
    Type create (Type t);
    Type read (ID id);
    Type update (Type t);
    void delete (ID id);
}
