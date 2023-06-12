package za.ac.cput.factory;
/*
 * User.java
 * Entity for the CustomerFactory.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 27/03/2023
 */

import za.ac.cput.domain.Customer;
import za.ac.cput.Util.Helper;

public class CustomerFactory {

    public static Customer creatCustomer(Integer customer_id, Integer sales_id, String customer_phoneNum, String customer_email){
        if (customer_id < 0)
            return null;

        if (sales_id < 0)
            return null;

        if (customer_phoneNum.equals("") || customer_phoneNum == null)
            return null;

        if (customer_email.equals("") || customer_email == null)
            return null;

        if (!Helper.isValidEmail(customer_email))
            return null;

        if (Helper.isNullorEmpty(customer_phoneNum))
            return null;

        Customer customer = new Customer.Builder()
                .setCustomer_id(customer_id)
                .setSales_id(sales_id)
                .setCustomer_phoneNum(customer_phoneNum)
                .setCustomer_email(customer_email)
                .build();
        return customer;
    }
}
