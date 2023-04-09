package za.ac.cput.factory;
import za.ac.cput.domain.Insurance;

/*
 * Insurance.java
 * Factory
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 01 April 2022.
 */

public class InsuranceFactory {
    //Creating object
    public static Insurance createInsurance(String insuranceID, char insuranceType, int insuranceCost){
        Insurance insurance = new Insurance.Builder()
                .setInsuranceID(insuranceID)
                .setInsuranceType(insuranceType)
                .setInsuranceCost(insuranceCost)
                .build();
        return insurance;

    }
}
