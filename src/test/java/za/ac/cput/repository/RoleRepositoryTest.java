package za.ac.cput.repository;

//Author: Jesse Hiebner(220357676)
//09/04/2023
//RoleRepositoryTest.java

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Role;


import static org.junit.jupiter.api.Assertions.*;

class RoleRepositoryTest {
    private  static RoleRepository REPOSITORY;
    private static Role role;

   
    @Test
    void getRepository() {
        assertNotNull(REPOSITORY);
    }

    @Test
    void getAll() {
        assertNotNull(REPOSITORY.getAll());
    }

    @Test
    void a_create() {
        Role cs = REPOSITORY.create(role);
        assertNotNull(cs);
    }

    @Test
    void b_read() {
        Role cs = REPOSITORY.read(role.getRoleID());
        assertNotNull(cs);
    }

    @Test
    void c_update() {
        Role updated = new Role.Builder().copy(role)
                .setRoleName("Monkey man")
                .build();
        assertNotNull(REPOSITORY.update(updated));

        System.out.println("Updated: " + updated);
    }

    @Test
     void d_delete() {
        boolean delete = REPOSITORY.delete(role.getRoleID());
        assertTrue(delete);
    }
}