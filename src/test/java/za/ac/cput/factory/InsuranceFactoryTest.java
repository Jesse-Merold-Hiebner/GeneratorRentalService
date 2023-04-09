package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Insurance;

/*
 * Insurance.java
 * TDD, Factory
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 07 April 2022.
 */

import static org.junit.jupiter.api.Assertions.*;

class InsuranceFactoryTest {

    @Test
    public void createInsurance(){
        Insurance insurance = InsuranceFactory.createInsurance("Avbob", 'C', 350);
        System.out.println(insurance);
        assertNotNull(insurance);
        assertEquals("Avbob", insurance.getInsuranceID());
    }

}