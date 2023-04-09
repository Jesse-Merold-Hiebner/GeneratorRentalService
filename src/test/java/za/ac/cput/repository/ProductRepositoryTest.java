package za.ac.cput.repository;

//Author: Adrian Bennett (214075982)

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Product;
import za.ac.cput.domain.Supplier;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.ProductFactory;
import za.ac.cput.factory.SupplierFactory;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private static ProductRepository repository = ProductRepository.getRepository();
    private static Address ad1 = AddressFactory.createAddresss("Long Street","25 ","7570","Cape Town","8");

    private static Supplier sup1 = SupplierFactory.createSupplier(59856,"Generators R Us","0215498756","genaratorsrus@gmail.com",ad1);

    private static Product product = ProductFactory.createProduct(25698,"12569",80,sup1);


    @Test
    void a_create(){

        Product created = repository.create(product);
        assertEquals(product.getProduct_id(),created.getProduct_id());
        System.out.println("Created : " + created);


    }

    @Test
    void b_read(){
        Product read = repository.read(product.getProduct_id());
        assertNotNull(read);
        System.out.println("Reading: " + read);
    }

    @Test
    void c_update(){
        Product update =  new Product.Builder().copy(product).setProduct_id(56987)
                .setSerial_number("25698")
                .setCost(56.3)
                .setSupplier(sup1)
                .build();
                assertNotNull(repository.update(update));
                System.out.println("Updated: "+ update);

    }

    @Test
    void d_delete(){

        boolean success = repository.delete(product.getProduct_id());
        assertTrue(success);
        System.out.println("Deleted :" + success);


    }

    @Test
    void e_getAll(){

        System.out.println("Showing all");

        System.out.println(repository.getAll());
    }

}