package za.ac.cput.repository;
/*
 * User.java
 * Entity for the ICustomerFactory.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 28/03/2023
 */

import za.ac.cput.domain.Customer;


import java.util.Set;

public interface ICustomerRepository extends IRepository <Customer, String> {
    Customer read(Integer customer_id);

    boolean delete(Integer sales_id);

    public Set<Customer> getAll();
}
