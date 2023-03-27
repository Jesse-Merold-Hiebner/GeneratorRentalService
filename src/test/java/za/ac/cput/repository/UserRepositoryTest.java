package za.ac.cput.repository;

/*
 * UserRepositoryTest.java
 * Entity for the UserRepositoryTest
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 25/03/2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class) //will follow in alphabetical order according to the alphabetical prefix
class UserRepositoryTest {

    private static UserRepository repository = UserRepository.getRepository(); //called from UserRepository
    private static User user = UserFactory.createUser(1,"Jhiebner","jhiebner1@gmail.com",1);

    @Test
    void a_create()
    {
        User created = repository.create(user);
        assertEquals(user.getUserEmail(), created.getUserEmail());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read()
    {
        User read = repository.read(user.getUserEmail());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        User updated = new User.Builder().copy(user).setUserID(2)
                .setUserName("Sundered242")
                .setUserEmail("Sundered242@gmail.com")
                .setEmployeeID(2)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() //then delete
    {
        boolean success = repository.delete(user.getUserEmail());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() //first get all
    {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}