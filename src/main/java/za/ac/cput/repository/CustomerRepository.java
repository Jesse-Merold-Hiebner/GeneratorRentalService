package za.ac.cput.repository;
/*
 * User.java
 * Entity for the CustomerFactory.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 28/03/2023
 */

import za.ac.cput.domain.Customer;


import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository{
    private static CustomerRepository repository = null;
    private Set<Customer> customerDB = null;

    private CustomerRepository(){
        customerDB = new HashSet<Customer>();
    }

    public static CustomerRepository getRepository(){

        if (repository == null)
            repository = new CustomerRepository();

        return repository;
    }

    @Override
    public Customer create(Customer customer) {

        boolean success = customerDB.add(customer);
        if (!success)
            return null;
        return customer;
    }

    @Override
    public Customer read(String s) {
        return null;
    }


    @Override
    public Customer read(Integer customer_id) {

        for (Customer r : customerDB)
        {
            if (r.getCustomer_id().equals(customer_id)) ;
            return r;
        }
        return null;

    }

    @Override
    public Customer update(Customer customer) {

        Customer oldCustomer = read(customer.getCustomer_id());
        if (oldCustomer != null){
            customerDB.remove(oldCustomer);
            customerDB.add(customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }


    @Override
    public boolean delete(Integer customer_id) {

        Customer oldCustomerToDelete = read(customer_id);
        if (oldCustomerToDelete == null)
            return false;
        customerDB.remove(oldCustomerToDelete);
        return true;
    }

    @Override
    public Set<Customer> getAll(){
        return customerDB;
    }
}
