package com.adp3.entity;


/**
 * @author Sonwabo Kasi
 * 214293939
 * desc: EmployeeRole class created using Builder Pattern
 */
public class EmployeeRole {
    private String empId, roleId;

    private EmployeeRole(Builder builder){
        this.empId = builder.empId;
        this.roleId = builder.roleId;
    }

    @Override
    public String toString() {
        return "EmployeeRole{" +
                "empId='" + empId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public String getRoleId() {
        return roleId;
    }

    public static class Builder{
        private String empId, roleId;

        public Builder setEmployeeId(String empId){
            this.empId = empId;
            return this;
        }

        public Builder setRoleId(String roleId){
            this.roleId = roleId;
            return this;
        }

        public Builder copy(EmployeeRole employeeR){
            this.empId = employeeR.empId;
            this.roleId = employeeR.roleId;
            return  this;
        }

        public  EmployeeRole build(){
            return new  EmployeeRole(this);
        }

    }

}
