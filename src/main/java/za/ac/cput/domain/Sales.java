package za.ac.cput.domain;

/*
 * Sales.java
 * Entity for sales
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 30 March 2022
 */

import java.time.LocalDate;

public class Sales {
    private String salesID;
    private char productID;
    private int totalAmount;
    private int changeAmount;
    private int employeeID;
    private String date;

    //Constructor
    private Sales(Builder builder){
        this.salesID = builder.salesID;
        this.productID = builder.productID;
        this.totalAmount = builder.totalAmount;
        this.changeAmount = builder.changeAmount;
        this.employeeID = builder.employeeID;
        this.date = builder.date;
    }

    //Getters
    public String getSalesID(){
        return salesID;
    }
    public char getProductID() {
        return productID;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getChangeAmount() {
        return changeAmount;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDate() {
        return date;
    }

    //toString() method
    @Override
    public String toString() {
        return "Sales{" +
                "sales=" + salesID +
                ", productID=" + productID +
                ", totalAmount=" + totalAmount +
                ", changeAmount=" + changeAmount +
                ", employeeID=" + employeeID +
                ", date=" + date +
                '}';
    }

    public static class Builder{
        private String salesID;
        private char productID;
        private int totalAmount;
        private int changeAmount;
        private int employeeID;
        private String date;

        //Setters
        public Builder setSalesID(String salesID){
            this.salesID = salesID;
            return this;
        }
        public Builder setProductID(char productID){
            this.productID = productID;
            return this;
        }

        public Builder setTotalAmount(int totalAmount){
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setChangeAmount(int changeAmount){
            this.changeAmount = changeAmount;
            return this;
        }

        public Builder setEmployeeID(int employeeID){
            this.employeeID = employeeID;
            return this;
        }

        public Builder setDate(String date){
            this.date = date;
            return this;
        }

        //copy
        public Builder copy(Sales sales){
            this.salesID = sales.salesID;
            this.productID = sales.productID;
            this.totalAmount = sales.totalAmount;
            this.changeAmount = sales.changeAmount;
            this.employeeID = sales.employeeID;
            this.date = sales.date;
            return this;
        }

        public Sales build(){
            return new Sales(this);
        }
    }
}

