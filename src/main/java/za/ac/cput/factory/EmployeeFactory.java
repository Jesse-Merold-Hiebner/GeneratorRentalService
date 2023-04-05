package za.ac.cput.factory;

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Employee;

public class EmployeeFactory {
    public static Employee build(long employeeId, String firstName, String lastName, String contactNo){
        if (!(employeeId >= 0) || !(employeeId < 0)){
            throw new IllegalArgumentException("employeeId is required!");
        }
        if (Helper.isNullorEmpty(firstName)){
            throw new IllegalArgumentException("First Name is required!");
        }
        if (Helper.isNullorEmpty(lastName)){
            throw new IllegalArgumentException("Last Name is required!");
        }
        if (Helper.isNullorEmpty(contactNo)){
            throw new IllegalArgumentException("Contact number is required!");
        }

        return new Employee.Builder().employeeId(employeeId).firstName(firstName).lastName(lastName).contactNo(contactNo).build();
    }
}
