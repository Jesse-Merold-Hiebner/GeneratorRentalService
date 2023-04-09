package za.ac.cput.domain;

/*
 * Insurance.java
 * Entity for insurance
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 30 March 2022
 */

public class Insurance {
    private String insuranceID;
    private char insuranceType;
    private int insuranceCost;

    //Constructor
    private Insurance(Builder builder){
        this.insuranceID = builder.insuranceID;
        this.insuranceType = builder.insuranceType;
        this.insuranceCost = builder.insuranceCost;
    }

    //Getters
    public String getInsuranceID() {
        return insuranceID;
    }

    public char getInsuranceType() {
        return insuranceType;
    }

    public int getInsuranceCost() {
        return insuranceCost;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceID='" + insuranceID + '\'' +
                ", insuranceType=" + insuranceType +
                ", insuranceCost=" + insuranceCost +
                '}';
    }

    public static class Builder{
        private String insuranceID;
        private char insuranceType;
        private int insuranceCost;

        //Setters

        public Builder setInsuranceID(String insuranceID) {
            this.insuranceID = insuranceID;
            return this;
        }

        public Builder setInsuranceType(char insuranceType) {
            this.insuranceType = insuranceType;
            return this;
        }

        public Builder setInsuranceCost(int insuranceCost) {
            this.insuranceCost = insuranceCost;
            return this;
        }

        //copy
        public Builder copy(Insurance insurance){
            this.insuranceID = insurance.insuranceID;
            this.insuranceType = insurance.insuranceType;
            this.insuranceCost = insurance.insuranceCost;
            return this;
        }

        public Insurance build(){
            return new Insurance(this);
        }
    }
}
