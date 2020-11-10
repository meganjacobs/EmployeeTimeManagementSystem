//package com.adp3.repository.bridge.impl;
//
//import com.adp3.entity.bridge.EmployeeLeave;
//import com.adp3.repository.bridge.EmployeeLeaveRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * @author Zubair Van Oudtshoorn
// * desc: Employess Leave Repository Implementation
// * Student#: 217203795
// */
//
//public class EmployeeLeaveRepositoryImpl implements EmployeeLeaveRepository {
//    private static EmployeeLeaveRepository repository = null;
//    private Set<EmployeeLeave> empLeaveDB;
//    public EmployeeLeaveRepositoryImpl() { this.empLeaveDB = new HashSet<>(); }
//
//    public static EmployeeLeaveRepository getRepository(){
//        if (repository == null) repository = new EmployeeLeaveRepositoryImpl();
//        return repository;
//
//    }
//
//
//    @Override
//    public EmployeeLeave create(EmployeeLeave employeeLeave) {
//
//        this.empLeaveDB.add(employeeLeave);
//
//        return employeeLeave;
//    }
//
//
//    /*method used to read a EmployeeLeave
//     * @param: EmpID
//     * @return: EmployeeLeave
//     * */
//
//    @Override
//    public EmployeeLeave read(String empID) {
//
//        for (EmployeeLeave el : this.empLeaveDB) {
//            if (el.getEmpID().equalsIgnoreCase(empID))
//                return el;
//        }
//        return null;
//    }
//
//    /*method used to update a EmployeeLeave
//     * @param: employeeLeave
//     * @return: EmployeeLeave
//     * */
//
//    @Override
//    public EmployeeLeave update(EmployeeLeave employeeLeave) {
//        //update the object
//        EmployeeLeave employeeLeaveRecord = read(employeeLeave.getEmpID());
//        if (employeeLeaveRecord != null)
//        this.empLeaveDB.remove(employeeLeaveRecord);
//        this.empLeaveDB.add(employeeLeave);
//        return employeeLeave;
//        }
//
//
//    /*method used to delete an EmployeeLeave record
//     * @param: empID
//     * @return: EmployeeLeave
//     * */
//
//    @Override
//    public void delete(String empID) {
//        EmployeeLeave employeeLeaveRecord = read(empID);
//        if (employeeLeaveRecord !=null)
//            this.empLeaveDB.remove(employeeLeaveRecord);
//
//    }
//
//    @Override
//    public Set<EmployeeLeave> getAll() {
//
//        return this.empLeaveDB;
//    }
//}
