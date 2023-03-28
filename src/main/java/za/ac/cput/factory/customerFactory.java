package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.Util.Helper;

public class customerFactory {

    public static Customer creatCustomer(String customer_id, String sales_id, String customer_phoneNum, String customer_email){
        if(Helper.isNullorEmpty(customer_id)||Helper.isNullorEmpty(sales_id)){
            return null;
        }
        String Customer_phoneNum = Helper.generateId();
        if(!Helper.isValidEmail(customer_email)){
            return null;
        }
        Customer customer = new Customer.Builder()
                .setCustomer_id(customer_id)
                .setSales_id(sales_id)
                .setCustomer_phoneNum(customer_phoneNum)
                .setCustomer_email(customer_email)
                .build();
        return customer;
    }
}
