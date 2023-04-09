package za.ac.cput.factory;

/*
 * UserFactory.java
 * Entity for the UserFactory.java
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 27/03/2023
 */

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.User;

public class UserFactory
{
    public static User createUser(int userID, String userName, String userEmail, int employeeID)
    {
        if (userID < 0)
            return null;

        if (userName.equals("") || userName == null)
            return null;

        if (userEmail.equals("") || userEmail == null)
            return null;

        if (!Helper.isValidEmail(userEmail)) //checks if valid email
            return null;

        if (Helper.isNullorEmpty(userName)) //checks if username is valid
            return null;


        return new User.Builder()
                .setUserID(userID)
                .setUserName(userName)
                .setUserEmail(userEmail)
                .setEmployeeID(employeeID)
                .build();
    }
}
