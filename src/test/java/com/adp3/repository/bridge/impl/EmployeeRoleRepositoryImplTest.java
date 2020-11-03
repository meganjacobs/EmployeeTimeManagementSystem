package com.adp3.repository.bridge.impl;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.repository.bridge.EmployeeRoleRepository;
import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static junit.framework.Assert.assertEquals;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */


//FixMethodOrder(MethodSorters.NAME_ASCENDING)
/*public class EmployeeRoleRepositoryImplTest {

    private static EmployeeRoleRepository employeeRoleRepository = new EmployeeRoleRepository() {
        @Override
        public List<EmployeeRole> findAll() {
            return null;
        }

        @Override
        public List<EmployeeRole> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<EmployeeRole> findAllById(Iterable<String> iterable) {
            return null;
        }

        @Override
        public <S extends EmployeeRole> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends EmployeeRole> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<EmployeeRole> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public EmployeeRole getOne(String s) {
            return null;
        }

        @Override
        public <S extends EmployeeRole> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends EmployeeRole> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<EmployeeRole> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends EmployeeRole> S save(S s) {
            return null;
        }

        @Override
        public Optional<EmployeeRole> findById(String s) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(String s) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(String s) {

        }

        @Override
        public void delete(EmployeeRole employeeRole) {

        }

        @Override
        public void deleteAll(Iterable<? extends EmployeeRole> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends EmployeeRole> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends EmployeeRole> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends EmployeeRole> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends EmployeeRole> boolean exists(Example<S> example) {
            return false;
        }
    };
    private static String empId = GenericHelper.generateID();
    private EmployeeRole employeeRole = EmployeeRoleFactory.createEmployeeRole(empId,"Manageer");


    @Test
    void a_create() {
        EmployeeRole created = employeeRoleRepository.save(employeeRole);
        assertEquals(employeeRole, created);
        System.out.println(created);

    }

    @Test
    void b_read() {
        Optional<EmployeeRole> read = employeeRoleRepository.findById(employeeRole.getEmpID());
        System.out.println(employeeRole);
    }

    @Test
    void c_update() {
        EmployeeRole updated = new EmployeeRole.Builder().copy(employeeRole).setEmployeeId(empId).setRoleId("Manager").build();
        updated = employeeRoleRepository.save(updated);
        System.out.println(updated);

    }

    @Test
    void d_getAll() {
        System.out.println(employeeRoleRepository.findAllById(t));
    }


    @Test
    void e_delete() {
        employeeRoleRepository.deleteById(employeeRole.getEmpID());
    }
}*/
