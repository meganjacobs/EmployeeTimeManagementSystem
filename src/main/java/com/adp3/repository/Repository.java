package com.adp3.repository;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Factory: Main Repository created with CRUD method commonality
 */
public interface Repository <Type, ID> {
    Type create (Type t);
    Type read (ID id);
    Type update (Type t);
    void delete (ID id);
}
