package za.ac.cput.domain;

/*
 * User.java
 * Entity for the Role.java
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 09/04/2023
 */

public class Role
{
    private Long RoleID; //Primary Key
    private String role_name;
    private String role_description;

    //insert private constructor


    public Long getRoleID() { return RoleID;}

    public String getRole_name() {
        return role_name;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRoleID(Long roleID) {
        RoleID = roleID;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    public static class Builder
    {
        private Long RoleID; //Primary Key
        private String role_name;
        private String role_description;

        //insert private constructor
        public Builder setRoleID(Long roleID) {
            this.RoleID = RoleID;
            return this;
        }

        public Builder setRoleName(String role_name) {
            this.role_name = role_name;
            return this;
        }

        public Builder setRoleDescription(String role_description) {
            this.role_description = role_description;
            return this;
        }


        public Builder copy(Role role)
        {
            this.RoleID = RoleID;
            this.role_name = role_name;
            this.role_description = role_description;

            return this;
        }

        public Role build()
        {
            return new Role();
        }
    }
}
