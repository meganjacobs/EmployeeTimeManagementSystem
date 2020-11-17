package com.adp3.entity.standalone;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Author: Sanele Ngwenya
 * Class: Part Time
 * Student number: 216019699
 * Class Description: Role
 */

@Entity



public class Role implements Serializable {
    @Id
    private String roleID;
    private String roleDesc;

    protected Role(){}
    private Role(Builder builder) {
        this.roleID = builder.roleID;
        this.roleDesc = builder.roleDesc;


    }

    public String getRoleID() {
        return roleID;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", roleDesc=" + roleDesc +
                '}';
    }

    public static class Builder {
        private String roleID;
        private String roleDesc;
/*
        public Builder() {
            this.roleID = roleID;
            this.roleDesc = roleDesc;
        } */

        public Builder setRoleID(String roleID) {
            this.roleID = roleID;
            return this;
        }

        public Builder setRoleDesc(String roleDesc) {
            this.roleDesc = roleDesc;
            return this;
        }

        public Builder copy(Role role) {
            this.roleDesc = role.roleDesc;
            this.roleID = role.roleID;
            return this;
        }

        public Role build() {
            return new Role(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(roleID, builder.roleID) &&
                    Objects.equals(roleDesc, builder.roleDesc);
        }

        @Override
        public int hashCode() {
            return Objects.hash(roleID, roleDesc);
        }
    }
}