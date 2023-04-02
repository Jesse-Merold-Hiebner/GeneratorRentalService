package za.ac.cput.factory;

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Employee;

public class EmployeeFactory
{
    public static Employee createEmployee(int employeeID, String firstName, String lastName, String employeeAddress
                                            , String contactNumber, int jobID)
    {
    if (firstName.equals("") || firstName == null)
        return null;

    if (lastName.equals("") || lastName == null)
        return null;

        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName))
            return null;

        return new Employee.Builder()
                .setEmployeeID(employeeID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmployeeAddress(employeeAddress)
                .setContactNumber(contactNumber)
                .setJobID(jobID)
                .build();
    }
}
