package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Supplier;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.SupplierFactory;

import static org.junit.jupiter.api.Assertions.*;

class SupplierRepositoryTest {


    private static  SupplierRepository repository = SupplierRepository.getRepository();
    private static Address ad1 = AddressFactory.createAddresss("Long Street","25 ","7570","Cape Town","8");

    private static Supplier sup1 = SupplierFactory.createSupplier(59856,"Generators R Us","0215498756","genaratorsrus@gmail.com",ad1);


    @Test
    void a_create(){
        Supplier created = repository.create(sup1);
        assertEquals(sup1.getSupplier_id(),created.getSupplier_id());
        System.out.println("created: " + created);

    }

    @Test
    void b_read(){
        Supplier read = repository.read(sup1.getSupplier_id());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){

        Supplier updated = new Supplier.Builder().copy(sup1).setSupplier_id(36985)
                .setSupplier_name("General Electrical")
                .setSupplier_contact("0219875036")
                .setSupplier_email("genaralelect@gmail.com")
                .setAddress(ad1)
                .build();
                assertNotNull(repository.update(updated));
                System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete(){

        boolean sucess = repository.delete(sup1.getSupplier_id());
        assertTrue(sucess);
        System.out.println("Deleted: " + sucess);

    }


    @Test
    void e_getAll(){
        System.out.println("Showing all");
        System.out.println(repository.getAll());
    }
}