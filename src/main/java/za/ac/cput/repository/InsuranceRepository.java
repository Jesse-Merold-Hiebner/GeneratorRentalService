package za.ac.cput.repository;
import za.ac.cput.domain.Insurance;
import java.util.HashSet;
import java.util.Set;

/*
 * Insurance.java
 * Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 04 April 2022.
 */

public class InsuranceRepository implements IInsuranceRepository {
    public static InsuranceRepository insuranceRepo;
    private Set <Insurance> insuranceDB = null;

    //Constructor
    private InsuranceRepository(){
        insuranceDB = new HashSet<Insurance>();
    }

    public static InsuranceRepository getInsuranceRepo(){
        if(insuranceRepo == null){
            insuranceRepo = new InsuranceRepository();
        }
        return insuranceRepo;
    }

    @Override
    public Insurance create(Insurance insurance) {
        boolean success = insuranceDB.add(insurance);
        if(!success) {
            return null;
        }
        return insurance;
    }

    @Override
    public Insurance read(String insuranceID) {
        for (Insurance readInsurance : insuranceDB){
            if (readInsurance.getInsuranceID().equals(insuranceID)){
                return readInsurance;
            }
        }
        return null;
    }

    @Override
    public Insurance update(Insurance insurance) {
        return null;
    }

    @Override
    public boolean delete(String insuranceID) {
        Insurance deleteInsurance = read(insuranceID);
        if(deleteInsurance == null){
            return false;
        }
        //deleting
        insuranceDB.remove(deleteInsurance);
        return true;
    }

    @Override
    public Set<Insurance> getAll() {
        return insuranceDB;
    }
}
