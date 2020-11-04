//package com.adp3.repository.bridge.impl;
//
//import com.adp3.entity.bridge.EmployeeSalary;
//import com.adp3.repository.bridge.EmployeeSalaryRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * Author: Liesl Gounden-Wentzel
// * Class: Part Time
// * Student number: 202104133
// * Description: EmployeeSalaryRepositoryImpl - implementation of EmployeeSalaryRepository as a concrete class
// */
//
//
//public class EmployeeSalaryRepositoryImpl implements EmployeeSalaryRepository {
//    private static EmployeeSalaryRepository repository = null;
//    private Set<EmployeeSalary> salaryDB;
//    public EmployeeSalaryRepositoryImpl() { this.salaryDB = new HashSet<>(); }
//
//    public static EmployeeSalaryRepository getRepository(){
//        if (repository == null) repository = new EmployeeSalaryRepositoryImpl();
//        return repository;
//
//        }
//
//
//    /*method used to create a new salary for Employees
//     * @param: EmployeeSalaryDesc - hours, rate
//     * @return: EmployeeSalary
//     * */
//    @Override
//    public EmployeeSalary create(EmployeeSalary employeeSalary){
//        this.salaryDB.add(employeeSalary);
//        return employeeSalary;
//    }
//
//
//    /*method used to read a EmployeeSalary
//     * @param: EmpID - eg. A2356
//     * @return: Employee Salary
//     * */
//    @Override
//    public EmployeeSalary read(String empID) {
//        // EmployeeSalary employeeSalary =null;
//        for (EmployeeSalary es : this.salaryDB) {
//            if (es.getEmpID().equalsIgnoreCase(empID))
//            return es;
//        }
//        return null;
//    }
//
//
//
//
//    /*method used to update a EmployeeSalary
//     * @param: employeeSalary
//     * @return: EmployeeSalary
//     * */
//    @Override
//    public EmployeeSalary update(EmployeeSalary employeeSalary) {
//        //update the object
//        EmployeeSalary oldEmp = read(employeeSalary.getEmpID());
//        if(oldEmp != null) {
//           // delete(employeeSalary.getEmpID());
//            this.salaryDB.remove(oldEmp);
//            this.salaryDB.add(employeeSalary);
//
//        }
//
//        return employeeSalary;
//    }
//
//
//
//    /*method used to delete a EmployeeSalary
//     * @param: empID - eg. A2345
//     * @return: void
//     * */
//    @Override
//    public void delete(String empID) {
//        EmployeeSalary existingEmployeeSalary = read(empID);
//        if (existingEmployeeSalary!= null) {
//            this.salaryDB.remove(existingEmployeeSalary);
//
//        }
//
//    }
//
//
//
//    /*method used to retrieve Collection of EmployeeSalary
//     * @param: void
//     * @return: Set
//     * */
//    @Override
//    public Set<EmployeeSalary> getAll() {
//        return this.salaryDB;
//    }
//}
