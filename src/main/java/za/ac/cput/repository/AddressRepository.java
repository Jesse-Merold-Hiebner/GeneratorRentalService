package za.ac.cput.repository;

import za.ac.cput.domain.Address;


import java.util.HashSet;
import java.util.Set;

public class AddressRepository implements IAddressRepository {

    private static AddressRepository repository = null;
    private Set<Address> addressesDB = null;
    private AddressRepository(){
        addressesDB = new HashSet<Address>();
    }

    public static AddressRepository getRepository(){

        if (repository == null)
            repository = new AddressRepository();

        return repository;
    }

    @Override
    public Address create(Address address) {
        boolean success = addressesDB.add(address);
        if (!success)
        return null;
        return address;
    }

    @Override
    public Address read(String addressId) {

        for (Address a : addressesDB){
            if (a.getAddressId().equals(addressId))
                return a;
        }
        return null;
    }

    @Override
    public Address update(Address address) {
        Address oldAddress = read(address.getAddressId());
        if (oldAddress==null) {
            addressesDB.remove(address);
            addressesDB.add(address);
            return null;
        }
        return address;
    }

    @Override
    public boolean delete(String addressId) {
        Address addressToDelete = read(addressId);
        if (addressToDelete==null)
            return false;
        addressesDB.remove(addressToDelete);
        return true;
    }

    @Override
    public Set<Address> getAll() {
        return addressesDB;
    }
}
