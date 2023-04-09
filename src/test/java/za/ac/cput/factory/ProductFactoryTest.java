package za.ac.cput.factory;

//Author: Adrian Bennett (214075982)

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Product;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Supplier;

class ProductFactoryTest {

    @Test
    public void testWithSuccess(){
        Address ad1 = AddressFactory.createAddresss("Long Street","25 ","7570","Cape Town","8");
        Supplier supp1 = SupplierFactory.createSupplier(256984,"Generator supplies","0215896521","generators@gmail.com",ad1);
        Product product = ProductFactory.createProduct(2565888,"56856",80,supp1);
    }

    @Test
    public void testWithFailure(){
        Address ad1 = AddressFactory.createAddresss("Long Street","25 ","7570","Cape Town","8");
        Supplier supp1 = SupplierFactory.createSupplier(256984,"Generator supplies","0215896521","generators@gmail.com",ad1);
        Product product = ProductFactory.createProduct(2565888,"",80,supp1);

    }

}