package za.ac.cput.repository;
import za.ac.cput.domain.Sales;
import java.util.Set;

/*
 * Sales.java
 * Interface
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 04 April 2022.
 */

public interface ISalesRepository extends IRepository <Sales, String>{
    public Set <Sales> getAll();

}
