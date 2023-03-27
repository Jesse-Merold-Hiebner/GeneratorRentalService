package za.ac.cput.factory;

/*
 * UserFactoryTest.java
 * Entity for the UserFactoryTest
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 27/03/2023
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest
{
    @Test

    public void test() {}

    @Test
    void createUser()
    {
        User user = UserFactory.createUser(1,"Jesse","jhiebner1@gmail.com",1);
        System.out.println(user);
        assertNotNull(user);
    }
}