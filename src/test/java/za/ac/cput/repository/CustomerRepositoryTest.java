package za.ac.cput.repository;
/*
 * User.java
 * Entity for the CustomerRepositoryTest.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 28/03/2023
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.customerFactory;
import za.ac.cput.factory.jobFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class CustomerRepositoryTest {


    private static CustomerRepository repository = CustomerRepository.getRepository();
    private static Customer customer = customerFactory.creatCustomer(001, 010, "0827642043", "Pmzaca@gmail.com");

    @Test
    void a_create()
    {
        Customer created = repository.create(customer);
        assertEquals(customer.getCustomer_id(), created.getCustomer_id());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read()
    {
        Customer read = repository.read(customer.getCustomer_id());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        Customer updated = new Customer.Builder().copy(customer).setCustomer_id(2)
                .setCustomer_id(201)
                .setSales_id(02221)
                .setCustomer_phoneNum("0848742053")
                .setCustomer_email("Gmzaca@gmail.com")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete()
    {
        boolean success = repository.delete(customer.getCustomer_id());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll()
    {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}