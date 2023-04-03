package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    public void testAddressFactory(){

        Address address = AddressFactory.createAddresss
                ("Loop Street","02","8000","Cape town","002");

        System.out.println(address.toString());
        assertNotNull(address);
    }

}