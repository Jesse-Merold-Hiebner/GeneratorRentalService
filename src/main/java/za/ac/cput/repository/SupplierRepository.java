package za.ac.cput.repository;

//Author: Adrian Bennett (214075982)

import za.ac.cput.domain.Supplier;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepository implements ISupplierRepository{

    private static SupplierRepository repository = null;

    private Set<Supplier> supplierDB = null;

    private SupplierRepository(){ supplierDB = new HashSet<Supplier>() ;}


    public static SupplierRepository getRepository(){

        if (repository ==null)

            repository = new SupplierRepository();

        return repository;
    }

    @Override
    public Set<Supplier> getAll(){return supplierDB;}

    @Override
    public Supplier create (Supplier supplier){

        boolean success = supplierDB.add(supplier);
        if (!success){
            return  null;
        }
        return  supplier;
    }


    @Override
    public Supplier read(Long supplier_id){

        for(Supplier s: supplierDB){
            if(s.getSupplier_id()== supplier_id){
                return  s;
            }
        }
        return  null;
    }

    @Override
    public Supplier update (Supplier supplier){

        Supplier supplier1 = read (supplier.getSupplier_id());
        if(supplier1 != null){
            supplierDB.remove(supplier1);
            supplierDB.add(supplier);
            System.out.println("Supplier Adedd");
            return supplier;
        }
        return null;
    }

    @Override
    public boolean delete(Long aLong){
        Supplier supplier1 = read(aLong);
        if(supplier1 != null){

            supplierDB.remove(supplier1);
            System.out.println("Supplier deleted");
            return true;
        }
        return false;
    }

}
