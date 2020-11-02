package com.adp3.repository;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Factory: Main IRepository created with CRUD method commonality
 */
@Deprecated
public interface IRepository<Type, ID> {
    Type create (Type t);
    Type read (ID id);
    Type update (Type t);
    void delete (ID id);
}
