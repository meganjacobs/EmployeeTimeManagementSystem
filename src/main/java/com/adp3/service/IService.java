package com.adp3.service;

public interface IService<Type, ID> {
    Type create (Type t);
    Type read (ID id);
    Type update (Type t);
    void delete (ID id);

}
