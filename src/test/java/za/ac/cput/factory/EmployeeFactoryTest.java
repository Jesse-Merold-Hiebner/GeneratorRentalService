package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test() {}

    @Test
    void createEmployee() {
        Employee employee = EmployeeFactory.createEmployee(1,"Jesse","Hiebner","jhiebner1@gmail.com","0817364831",1);
        System.out.println(employee);
        assertNotNull(employee);
    }
}