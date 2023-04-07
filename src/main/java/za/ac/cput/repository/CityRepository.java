package za.ac.cput.repository;


import za.ac.cput.domain.City;

import java.util.HashSet;
import java.util.Set;

public class CityRepository implements ICityRepository{


    private static CityRepository repository = null;
    private Set<City> cityDB = null;

    private CityRepository(){

        cityDB = new HashSet<City>();
    }

    public static CityRepository getRepository(){
        if (repository==null)

            repository = new CityRepository();

        return repository;
    }


    @Override
    public City create(City city) {
        boolean success = cityDB.add(city);
        if (!success) {

            return null;
        }
        return city;
    }

    @Override
    public City read(String cityId) {
        for (City c : cityDB){
            if (c.getCityId().equals(cityId))
                return c;
        }
        return null;

    }

    @Override
    public City update(City city) {

        City oldCity = read(city.getCityId());
        if (oldCity==null) {
            cityDB.remove(city);
            cityDB.add(city);
            return null;
        }
        return city;

    }

    @Override
    public boolean delete(String cityId) {
        City cityToDelete = read(cityId);
        if (cityToDelete==null)
            return false;
        cityDB.remove(cityToDelete);
        return true;
    }

    @Override
    public Set<City> getAll() {
        return cityDB;
    }
}
