package com.adp3.repository.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.repository.IRepository;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Repository
 * 2020
 */

public class EmployeeRepository implements IRepository<Employee, String> {
    private Set<Employee> employeeDB;

    public EmployeeRepository() {
        this.employeeDB = new HashSet<>();
    }

    /** create an employee object and persist to the repository database */
    @Override
    public Employee create( Employee employee ) {
       this.employeeDB.add( employee );

        return employee;
    }

    /** read an employee object from the repository database */
    @Override
    public Employee read( String empID ) {
        Employee employee = null;

        for ( Employee emp : this.employeeDB ){

            if( emp.getEmpID().equalsIgnoreCase(empID) ){
                employee = emp;
                break;
            }
        }
        return employee;
    }

    /** update an employee object in the repository database */
    @Override
    public Employee update( Employee employee ) {
        Employee oldEmployee = read( employee.getEmpID() );

        if( oldEmployee != null ){
            this.employeeDB.remove( oldEmployee );
            this.employeeDB.add( employee );
        }
        return  employee;
    }

    /** delete an employee object from the repository database */
    @Override
    public void delete( String empID ) {
        Employee employee = read( empID );

        if( employee != null ){
            this.employeeDB.remove( employee );
        }
    }

}
