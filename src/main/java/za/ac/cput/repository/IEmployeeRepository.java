package za.ac.cput.repository;

//Author: Lutho Nondala (219369399)

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.User;

import java.util.Set;

public interface IEmployeeRepository extends IRepository <Employee, Long>{
    public Set<Employee> getAll();
}
