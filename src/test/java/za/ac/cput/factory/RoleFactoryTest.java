package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Job;
import za.ac.cput.domain.Role;


import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest
{
    private Role role;

    @Test
    public void createRole(){
        Role role = RoleFactory.createRole(1L, "Marketer", "Makes Loads of Money sometimes");
        System.out.println(role.toString());
        assertNotNull(role);
        System.out.println("Role created");
    }

}