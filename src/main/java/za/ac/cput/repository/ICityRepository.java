package za.ac.cput.repository;


import za.ac.cput.domain.City;

import java.util.Set;

public interface ICityRepository extends IRepository<City ,String > {

    public Set<City> getAll();

}
