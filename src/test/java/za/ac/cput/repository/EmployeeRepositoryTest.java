package za.ac.cput.repository;

//Author: Lutho Nondala (219369399)

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.jobFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {
    private static EmployeeRepository REPOSITORY = EmployeeRepository.getRepository();;
    private static Address address = AddressFactory.createAddresss("Loop Street", "5", "5624", "NukeTown", "1");
    private static Job job = jobFactory.createJob(1, "Cashier", 5000);
    private static Employee employee = EmployeeFactory.build(1, "John", "Doe","0752587542", address, job);

    @Test
    @Order(1)
    void getRepository() {
        assertNotNull(REPOSITORY);
    }

    @Test
    @Order(2)
    void create() {
        Employee emp = REPOSITORY.create(employee);
        assertSame(employee.getEmployee_id(), emp.getEmployee_id());
    }

    @Test
    @Order(3)
    void read() {
        Employee emp = REPOSITORY.read(employee.getEmployee_id());
        assertSame(employee.getEmployee_id(), emp.getEmployee_id());
    }

    @Test
    @Order(4)
    void update() {
        Employee update = employee;
        update.setFirst_name("Jane");
        Employee emp = REPOSITORY.update(update);
        assertEquals("Jane", emp.getFirst_name());
    }

    @Test
    @Order(5)
    void getAll() {
        Set<Employee> db= REPOSITORY.getAll();
        assertNotNull(db);
    }

    @AfterAll
    static void delete() {
        Boolean delete = REPOSITORY.delete(employee.getEmployee_id());
        System.out.println(delete);
    }
}