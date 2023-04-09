package za.ac.cput.factory;

//Author: Lutho Nondala (219369399)

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {
    private Employee employee;
    private Address address;
    private Job job;

    @Test
    void create() {
        address = AddressFactory.createAddresss("Loop Street", "5", "5624", "NukeTown", "1");
        job = jobFactory.createJob(1, "Cashier", 5000);
        employee = EmployeeFactory.build(1, "John", "Doe","0752587542", address, job);
        assertNotNull(employee);
    }
}