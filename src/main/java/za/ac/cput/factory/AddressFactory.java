package za.ac.cput.factory;

/*
Entity : AddressFactory
 Author: Mahad Hassan  (219122822)
Date: 30/03/2023
 */
import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Address;

public class AddressFactory {

    public static Address createAddresss
            (String streetName, String   houseNumber, String  postalCode, String   townName, String cityId)
    {

        if  (Helper.isNullorEmpty(streetName)||Helper.isNullorEmpty(houseNumber)
                || Helper.isNullorEmpty(postalCode)|| Helper.isNullorEmpty(townName)||Helper.isNullorEmpty(cityId))


            return null;
        String addressId = Helper.generateId();

        return new Address.Builder().setAddressId(addressId)
                .setStreetName(streetName)
                .setHouseNumber(houseNumber)
                .setPostalCode(postalCode)
                .setTownName(townName)
                .setCityId(cityId)
                .build();
    }
}

