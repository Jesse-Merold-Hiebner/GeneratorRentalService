package za.ac.cput.repository;

/*
 * UserRepository.java
 * Entity for the UserRepository
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 27/03/2023
 */

import za.ac.cput.domain.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements IUserRepository
{

    private static UserRepository repository = null;
    private Set<User> userDB = null;

    private UserRepository(){
        userDB = new HashSet<User>();
    }

    public static UserRepository getRepository(){
        if (repository == null)
            repository = new UserRepository();

        return repository;
    }

    @Override
    public User create(User user)
    {
        boolean success = userDB.add(user);
        if (!success)
            return null;
        return user;
    }

    @Override
    public User read(String userEmail)
    {   //linear or sequential search (compact)
        for (User u : userDB)
        {
            if (u.getUserEmail().equalsIgnoreCase("userEmail")) ;
            return u;
        }
        return null;

        //Filters through set
        //Searches through the set, 1 object at a time
        //Finding the object with the same userEmail that matches
        //Returning the object
        //And if it cannot find it, it returns it as null;

    }

    @Override
    public User update(User user)
    {
        User oldUser = read(user.getUserEmail());
        if (oldUser != null){
            userDB.remove(oldUser); //removing old employee information
            userDB.add(user);       //replacing with new employee information
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(String UserEmail) {
        //never pass through firstName or Last name as there could be more than 1 person with the same last name or first name

        User oldUserToDelete = read(UserEmail);
        if (oldUserToDelete == null)
            return false;
        userDB.remove(oldUserToDelete);
        return true;
    }

    @Override
    public Set<User> getAll()
    {
        //1 liner.
        return userDB;
    }
}
