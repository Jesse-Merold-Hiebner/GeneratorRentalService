package za.ac.cput.factory;


import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Supplier;


public class SupplierFactory {

    public static Supplier createSupplier(long supplier_id, String suppler_name, String suppler_contact, String suppler_email, Address address){

        if (supplier_id< 0)
            return null;

        if(Helper.isNullorEmpty(suppler_name) || Helper.isNullorEmpty(suppler_contact) || Helper.isValidEmail(suppler_email) || Helper.isNullorEmpty(String.valueOf(address))){
            throw new IllegalArgumentException("Supplier id, suppler contact, supplier email and address is required");

        }



        return new Supplier.Builder()
                .setSupplier_id(supplier_id)
                .setSupplier_name(suppler_name)
                .setSupplier_contact(suppler_contact)
                .setSupplier_email(suppler_email)
                .setAddress(address)
                .build();

    }


}
