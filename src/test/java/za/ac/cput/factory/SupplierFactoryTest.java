package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Supplier;
import za.ac.cput.domain.Address;

class SupplierFactoryTest {

    @Test
    public void withSuccess(){

        Address ad1 = AddressFactory.createAddresss("Long Street","25 ","7570","Cape Town","8");
        Supplier supplier = SupplierFactory.createSupplier(256984,"Generator supplies","0215896521","generators@gmail.com",ad1);
        System.out.println(supplier.toString());
        assertNotNull(supplier);
    }

    @Test
    public void testWithFailure(){
        Address ad1 = AddressFactory.createAddresss("Long Street","25 ","7570","Cape Town","8");
        Supplier supplier = SupplierFactory.createSupplier(256984,"Generator supplies","0215896521","",ad1);

    }

}