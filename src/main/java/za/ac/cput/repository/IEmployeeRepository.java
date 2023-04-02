package za.ac.cput.repository;

/*
 * IEmployeeRepository.java
 * Entity for the IEmployeeRepository
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 28/03/2023
 */

import za.ac.cput.domain.Employee;

import java.util.Set;

public interface IEmployeeRepository extends IRepository <Employee, String>
{
    Employee read(int employeeID);

    boolean delete(int employeeID);

    //create, read, update, delete
    public Set<Employee> getAll();
}
