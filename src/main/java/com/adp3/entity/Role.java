package com.adp3.entity;

public class Role
{
    //Role_ID
    //Role_Desc
    //getRole()
    //setRole()

    private String role_id;
    private String role_desc;


    private Role(Builder builder){
        this.role_id = builder.role_id;
        this.role_desc = builder.role_desc;


    }

    public String getRole_id() {
        return role_id;
    }

    public String getRole_desc() {
        return role_desc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_desc=" + role_desc +
                '}';
    }

    public static class Builder{
        private String role_id;
        private String role_desc;

        public Builder(String role_id, String role_desc) {
            this.role_id = role_id;
            this.role_desc = role_desc;
        }

        public Builder setRole_id(String role_id) {
            this.role_id = role_id;
            return this;
        }

        public Builder setRole_desc(String role_desc) {
            this.role_desc = role_desc;
            return this;
        }

        public Builder copy(Role role)
        {
            this.role_desc = role.role_desc;
            this.role_id = role.role_id;
            return  this;
        }

        public Role build(){
            return new Role(this);
        }

    }
}
