package za.ac.cput.factory;

/*
 * RoleFactory.java
 * Entity for the RoleFactory.java
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 27/03/2023
 */

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Role;

public class RoleFactory
{
    public static Role createRole(Long RoleID, String role_name, String role_description)
    {
        if (RoleID < 0)
            return null;

        if (role_name.equals("") || role_name == null)
            return null;

        if (role_description.equals("") || role_description == null)
            return null;

        if (Helper.isNullorEmpty(role_name)) //checks if Rolename is valid
            return null;


        return new Role.Builder()
                .setRoleID(RoleID)
                .setRoleName(role_name)
                .setRoleDescription(role_description)
                .build();
    }
}
