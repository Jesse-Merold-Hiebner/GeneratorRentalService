package za.ac.cput.domain;
/*
 * User.java
 * Entity for the Customer.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 27/03/2023
 */
import java.util.Objects;

public class Customer {
    private int customer_id;
    private int sales_id;
    private String customer_phoneNum;
    private String customer_email;

    //private constructor
    private Customer(Builder builder){
        this.customer_id = builder.customer_id;
        this.sales_id = builder.sales_id;
        this.customer_phoneNum = builder.customer_phoneNum;
        this.customer_email = builder.customer_email;
    }


    public Integer getCustomer_id() {
        return customer_id;
    }

    public Integer getSales_id() {
        return sales_id;
    }

    public String getCustomer_phoneNum() {
        return customer_phoneNum;
    }

    public String getCustomer_email() {
        return customer_email;
    }
    //hasCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customer_id == customer.customer_id && sales_id == customer.sales_id && customer_phoneNum.equals(customer.customer_phoneNum) && customer_email.equals(customer.customer_email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_id, sales_id, customer_phoneNum, customer_email);
    }

//toString

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id='" + customer_id + '\'' +
                ", sales_id='" + sales_id + '\'' +
                ", customer_phoneNum='" + customer_phoneNum + '\'' +
                ", customer_email='" + customer_email + '\'' +
                '}';
    }

    //start of my builder class
    public static class Builder{
        private Integer customer_id;
        private Integer sales_id;
        private String customer_phoneNum;
        private String customer_email;

        public Builder setCustomer_id(Integer customer_id) {
            this.customer_id = customer_id;
            return this;
        }

        public Builder setSales_id(Integer sales_id) {
            this.sales_id = sales_id;
            return this;
        }

        public Builder setCustomer_phoneNum(String customer_phoneNum) {
            this.customer_phoneNum = customer_phoneNum;
            return this;
        }

        public Builder setCustomer_email(String customer_email) {
            this.customer_email = customer_email;
            return this;
        }

        public Builder copy(Customer customer){
            this.customer_id = customer.customer_id;
            this.sales_id = customer.sales_id;
            this.customer_phoneNum = customer.customer_phoneNum;
            this.customer_email = customer.customer_email;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}

