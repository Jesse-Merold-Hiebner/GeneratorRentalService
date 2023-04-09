package za.ac.cput.repository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Insurance;
import za.ac.cput.factory.InsuranceFactory;
/*
 * Insurance.java
 * TDD, Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 07 April 2022.
 */

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class InsuranceRepositoryTest {
    private static InsuranceRepository insuranceRepo = InsuranceRepository.getInsuranceRepo();
    private static Insurance insurance = InsuranceFactory.createInsurance("Assupol", 'D', 290);

    @Test
    void a_create(){
        Insurance created = insuranceRepo.create(insurance);
        assertEquals(insurance.getInsuranceID(), created.getInsuranceID());
        System.out.println("Create" + created);
    }

    @Test
    void b_read() {
        Insurance read = insuranceRepo.read(insurance.getInsuranceID());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void c_update() {
        Insurance updated = new Insurance.Builder().copy(insurance)
                .setInsuranceID("8976")
                .setInsuranceType('B')
                .setInsuranceCost(190)
                .build();
        System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete() {
        boolean deleted = insuranceRepo.delete(insurance.getInsuranceID());
        assertTrue(deleted);
        System.out.println("Deleted:" + deleted);
    }

    @Test
    void getAll() {
        System.out.println("Show all:");
        System.out.println(insuranceRepo.getAll());
        assertNotNull(insuranceRepo.getAll());
    }
}