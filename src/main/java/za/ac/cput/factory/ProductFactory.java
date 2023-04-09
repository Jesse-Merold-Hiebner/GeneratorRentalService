package za.ac.cput.factory;

//Author: Adrian Bennett (214075982)

import za.ac.cput.Util.Helper;

import za.ac.cput.domain.Product;
import za.ac.cput.domain.Supplier;

public class ProductFactory {

    public static Product createProduct(long product_id, String serial_number, double cost, Supplier supplier) {

        if (product_id < 0)
            return null;

        if(cost < 0)
            return null;


        if(Helper.isNullorEmpty(serial_number) || Helper.isNullorEmpty(String.valueOf(supplier))){
            throw new IllegalArgumentException("serial number required");
        }

        return new Product.Builder()
                .setProduct_id(product_id)
                .setSerial_number(serial_number)
                .setCost(cost)
                .setSupplier(supplier)
                .build();
    }


}
