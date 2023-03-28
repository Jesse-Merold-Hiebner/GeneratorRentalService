package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class customerFactoryTest {
    @Test
    public void testWithSuccess() {
        Customer customer = customerFactory.creatCustomer("20230327", "12345", "0716352013", "Zmzaca@gmail.com");
        System.out.println(customer.toString());
        assertNotNull(customer);

    }

    @Test
    public void testWithFailure() {
        Customer customer = customerFactory.creatCustomer("", "12345", "0716352013", "Zmzaca@gmail.com");
        System.out.println(customer.toString());
        assertNotNull(customer);
    }


}