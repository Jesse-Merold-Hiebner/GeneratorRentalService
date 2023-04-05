package za.ac.cput.factory;

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;

public class EmployeeFactory {
    public static Employee build(long employeeId, String firstName, String lastName, String contactNo, Address address, Job job){
        if (!(employeeId >= 0 || employeeId < 0)){
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

        if (job == null){
            throw new IllegalArgumentException("Job is required!");
        }

        if (address == null){
            throw new IllegalArgumentException("Contact number is required!");
        }

        return new Employee.Builder().employeeId(employeeId).firstName(firstName).lastName(lastName).contactNo(contactNo).address(address).job(job).build();
    }
}
