package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.User;

import java.util.Set;

public interface IEmployeeRepository extends IRepository <Employee, Long>{
    public Set<Employee> getAll();
}
