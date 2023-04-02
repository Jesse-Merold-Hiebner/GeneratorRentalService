package za.ac.cput.repository;

/*
 * EmployeeRepository.java
 * Entity for the EmployeeRepository
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 28/03/2023
 */

import za.ac.cput.domain.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployeeRepository
{

    private static EmployeeRepository repository = null;
    private Set<Employee> employeeDB = null;

    private EmployeeRepository(){
        employeeDB = new HashSet<Employee>();
    }

    public static EmployeeRepository getRepository(){
        if (repository == null)
            repository = new EmployeeRepository();

        return repository;
    }

    @Override
    public Employee create(Employee employee){
        boolean success = employeeDB.add(employee);
        if (!success)
            return null;
        return employee;
    }

    @Override
    public Employee read(String s) {
        return null;
    }

    @Override
    public Employee read(int employeeID)
    {   //linear or sequential search (compact)
        for (Employee e : employeeDB)
        {
            if (e.getEmployeeID() == employeeID) ;
            return e;
        }
        return null;

        //Filters through set
        //Searches through the set, 1 object at a time
        //Finding the object with the same userEmail that matches
        //Returning the object
        //And if it cannot find it, it returns it as null;

    }

    @Override
    public Employee update(Employee employee)
    {
        Employee oldEmployee = read(employee.getEmployeeID());
        if (oldEmployee != null){
            employeeDB.remove(oldEmployee); //removing old employee information
            employeeDB.add(employee);       //replacing with new employee information
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public boolean delete(int employeeID) {
        //never pass through firstName or Last name as there could be more than 1 person with the same last name or first name

        Employee oldEmployeeToDelete = read(employeeID);
        if (oldEmployeeToDelete == null)
            return false;
        employeeDB.remove(oldEmployeeToDelete);
        return true;
    }

    @Override
    public Set<Employee> getAll()
    {
        //1 liner.
        return employeeDB;
    }
}
