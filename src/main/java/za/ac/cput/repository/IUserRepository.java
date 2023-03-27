package za.ac.cput.repository;

/*
 * IUserRepository.java
 * Entity for the IUserRepository
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 27/03/2023
 */

import za.ac.cput.domain.User;
import java.util.Set;

public interface IUserRepository extends IRepository <User, String>
{
    //create, read, update, delete
    public Set<User> getAll();
}
