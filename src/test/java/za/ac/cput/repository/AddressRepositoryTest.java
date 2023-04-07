package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class AddressRepositoryTest {

    private static AddressRepository  repository = AddressRepository.getRepository();
    private static Address address =
            AddressFactory.createAddresss
                    ("Bantam Street","31","8001","Cape town ","01");

    @Test
    void a_create() {
        Address created = repository.create(address);
        assertEquals(address.getAddressId(),created.getAddressId());
        System.out.println("Created: " + created);


    }
    @Test
    void b_read(){
        Address read = repository.read(address.getAddressId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Address updated = new Address.Builder().copy(address)
                .setHouseNumber("67")
                .setPostalCode("8000")
                .build();
        assertNotNull(repository.update(updated));

        System.out.printf("Updated: " + updated);


    }

    @Test
    void e_delete() {
        boolean success = repository.delete(address.getAddressId());
        assertTrue(success);
        System.out.println("Deleted: " + success);


    }

    @Test
    void d_getAll() {
       System.out.println("Display All" );
        System.out.println( "Display All: " + repository.getAll());

    }
}