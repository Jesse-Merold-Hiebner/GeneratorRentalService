package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Sales;

/*
 * Sales.java
 * TDD, Factory
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 07 April 2022.
 */

import static org.junit.jupiter.api.Assertions.*;

class SalesFactoryTest {

    @Test
    public void createSales(){
        Sales sales = SalesFactory.createSales("898768", 'A', 12, 15, 7865, "12 March 2022");
        System.out.println(sales);
        assertNotNull(sales);
        assertEquals("898768", sales.getSalesID());
    }

}