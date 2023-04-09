package za.ac.cput.repository;

//Author: Lutho Nondala (219369399)

import za.ac.cput.domain.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployeeRepository{

    private static EmployeeRepository REPOSITORY;
    private Set<Employee> db;

    public EmployeeRepository(){
        this.db = new HashSet<>();
    }

    public static EmployeeRepository getRepository(){
        if (REPOSITORY == null){
            REPOSITORY = new EmployeeRepository();
        }
        return REPOSITORY;
    }

    @Override
    public Set<Employee> getAll() {
        return db;
    }

    @Override
    public Employee create(Employee employee) {
        this.db.add(employee);
        System.out.println("Employee created");
        return employee;
    }

    @Override
    public Employee read(Long employeeId) {
        for (Employee e : db){
            if (e.getEmployee_id() == employeeId){
                return e;
            }
        }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee emp = read(employee.getEmployee_id());
        if (emp != null){
            db.remove(emp);
            db.add(employee);
            System.out.println("Employee updated");
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(Long l) {
        Employee emp = read(l);
        if (emp != null){
            db.remove(emp);
            System.out.println("Employee Deleted");
            return true;
        }
        return false;
    }
}
