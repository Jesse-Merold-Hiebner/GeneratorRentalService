package za.ac.cput.repository;
import za.ac.cput.domain.Sales;
import java.util.HashSet;
import java.util.Set;

/*
 * Sales.java
 * Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 01 April 2022.
 */

public class SalesRepository implements ISalesRepository{
    public static SalesRepository salesRepo = null;
    private Set <Sales> salesDB = null;

    //Constructor
    private SalesRepository(){
        salesDB = new HashSet<Sales>();
    }

    //Testing repo
    public static SalesRepository getSalesRepo(){
        if(salesRepo == null){
            salesRepo = new SalesRepository();
        }
        return salesRepo;
    }

    //methods CRUD
    @Override
    public Sales create(Sales sales) {
        boolean success = salesDB.add(sales);
        if(!success) {
            return null;
        }
        return sales;
    }

    @Override
    public Sales read(String salesID) {          //read with primary key
        for (Sales readSales : salesDB){
            if (readSales.getSalesID().equals(salesID)){
                return readSales;
            }
        }
        return null;
    }

    @Override
    public Sales update(Sales sales) {
        return null;
    }

    @Override
    public boolean delete(String salesID) {
        Sales deleteSales = read(salesID);
        if(deleteSales == null){
            return false;
        }
        //deleting
        salesDB.remove(deleteSales);
        return true;
    }

    @Override
    public Set<Sales> getAll() {
        return salesDB;
    }


}
