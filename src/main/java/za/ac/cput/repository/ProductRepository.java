package za.ac.cput.repository;

//Author: Adrian Bennett (214075982)

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Product;
import java.util.HashSet;
import java.util.Set;


public class ProductRepository implements IProductRepository{

        private static ProductRepository repository = null;

    private Set<Product> productDB = null;

    private ProductRepository() { productDB = new HashSet<Product>();}

    public static ProductRepository getRepository(){

        if (repository ==null)

            repository = new ProductRepository();

        return repository;

    }

    @Override
    public Set<Product> getAll() {
        return productDB;
    }


    @Override
    public Product create (Product product){

        boolean success = productDB.add(product);
        if (!success){

            return null;

        }
        return product;
    }


    @Override
    public Product read(Long product_id) {
        for (Product p : productDB) {

            if (p.getProduct_id() == product_id) {
                return p;
            }

        }
        return null;
    }

    @Override
    public Product update(Product product){

        Product product1 = read(product.getProduct_id());
        if(product1 != null){
            productDB.remove(product1);
            productDB.add(product);
            System.out.println("Product updated");
            return product;
        }
        return  null;
    }


    @Override
    public boolean delete(Long aLong) {
        Product product1 = read(aLong);
        if(product1 != null){

            productDB.remove(product1);
            System.out.println("Product deleted");
            return true;
        }
        return false;
    }
}
