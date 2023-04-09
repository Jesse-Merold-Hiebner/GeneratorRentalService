package za.ac.cput.repository;

import za.ac.cput.domain.Product;
import java.util.Set;

public interface IProductRepository extends IRepository<Product,Long>{

    public Set<Product> getAll();
}
