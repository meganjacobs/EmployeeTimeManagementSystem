package com.adp3.entity;

/**
 * Author: Sanele Ngwenya
 * Class: Part Time
 * Student number: 216019699
 * Class Description: Role
 */

public class Role {
    private int roleID;
    private int roleDesc;


    private Role(Builder builder) {
        this.roleID = builder.roleID;
        this.roleDesc = builder.roleDesc;


    }

    public int getRoleID() {
        return roleID;
    }

    public int getRoleDesc() {
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
        private int roleID;
        private int roleDesc;

        public Builder(int roleID, int roleDesc) {
            this.roleID = roleID;
            this.roleDesc = roleDesc;
        }

        public Builder setRoleID(int roleID) {
            this.roleID = roleID;
            return this;
        }

        public Builder setRoleDesc(int roleDesc) {
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

    }
}
