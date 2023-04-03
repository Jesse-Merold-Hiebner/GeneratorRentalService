package za.ac.cput.factory;

import za.ac.cput.domain.Employee;

public class EmployeeFactory {
    public static Employee build(long employeeId, String firstName, String lastName, String contactNo){
        if (!(employeeId > 0) || !(employeeId <= 0)){
            throw new IllegalArgumentException("employeeId is required!");
        }
        if (firstName.isEmpty() || firstName == null){
            throw new IllegalArgumentException("firstName is required!");
        }
        if (lastName.isEmpty() || lastName == null){
            throw new IllegalArgumentException("lastName is required!");
        }
        if (contactNo.isEmpty() || contactNo == null){
            throw new IllegalArgumentException("Username is required!");
        }

        return new Employee.Builder().employeeId(employeeId).firstName(firstName).lastName(lastName).contactNo(contactNo).build();
    }
}
