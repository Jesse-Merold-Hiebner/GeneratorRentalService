package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Sales;
import za.ac.cput.factory.SalesFactory;

/*
 * Sales.java
 * TDD, Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 07 April 2022.
 */

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class SalesRepositoryTest {
    private static SalesRepository salesRepo = SalesRepository.getSalesRepo();
    private static Sales sales = SalesFactory.createSales("898768", 'A', 12, 15, 7865, "15 March 2022");

    @Test
    void a_create(){
        Sales created = salesRepo.create(sales);
        assertEquals(sales.getSalesID(), created.getSalesID());
        System.out.println("Create" + created);
    }

    @Test
    void b_read() {
        Sales read = salesRepo.read(sales.getSalesID());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void c_update() {
        Sales updated = new Sales.Builder().copy(sales)
                .setSalesID("8976")
                .setProductID('B')
                .setTotalAmount(90)
                .setChangeAmount(50)
                .setEmployeeID(4009)
                .setDate("09 April 2021")
                .build();
        System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete() {
        boolean deleted = salesRepo.delete(sales.getSalesID());
        assertTrue(deleted);
        System.out.println("Deleted:" + deleted);
    }

    @Test
    void getAll() {
        System.out.println("Show all:");
        System.out.println(salesRepo.getAll());
        assertNotNull(salesRepo.getAll());
    }
}