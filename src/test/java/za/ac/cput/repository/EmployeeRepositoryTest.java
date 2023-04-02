package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class) //will follow in alphabetical order according to the alphabetical prefix
class EmployeeRepositoryTest {

    private static EmployeeRepository repository = EmployeeRepository.getRepository(); //called from UserRepository
    private static Employee employee = EmployeeFactory.createEmployee(1,"Jesse","Hiebner","18 Cyprus Rd, Wetton","0817364831",1);

    @Test
    void a_create()
    {
        Employee created = repository.create(employee);
        assertEquals(employee.getEmployeeID(), created.getEmployeeID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read()
    {
        Employee read = repository.read(employee.getEmployeeID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        Employee updated = new Employee.Builder().copy(employee).setEmployeeID(2)
                .setFirstName("Sundered")
                .setLastName("Void")
                .setEmployeeAddress("122 Money Way, Home")
                .setContactNumber("0811111111")
                .setJobID(12)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() //then delete
    {
        boolean success = repository.delete(employee.getEmployeeID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() //first get all
    {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}