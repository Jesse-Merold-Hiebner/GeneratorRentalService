package za.ac.cput.factory;
import za.ac.cput.domain.Sales;

/*
 * Sales.java
 * Factory
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 04 April 2022.
 */


public class SalesFactory {
    //Creating sales object
    public static Sales createSales(String salesID, char productID, int totalAmount, int changeAmount, int employeeID, String date){
        Sales sales = new Sales.Builder()
                .setSalesID(salesID)
                .setProductID(productID)
                .setTotalAmount(totalAmount)
                .setChangeAmount(changeAmount)
                .setEmployeeID(employeeID)
                .setDate(date)
                .build();
        return sales;
    }
}
