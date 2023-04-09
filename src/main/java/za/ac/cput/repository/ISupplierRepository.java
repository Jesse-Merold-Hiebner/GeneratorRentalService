package za.ac.cput.repository;

import za.ac.cput.domain.Supplier;

import java.util.Set;

public interface ISupplierRepository extends IRepository<Supplier,Long>{

    public Set<Supplier> getAll();

}
