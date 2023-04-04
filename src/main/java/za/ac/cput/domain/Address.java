package za.ac.cput.domain;

/*
Entity : Addrress.java
 Author: Mahad Hassan  (219122822)
Date: 30/03/2023
 */
public class Address {

    private String addressId;
    private String streetName;
    private String houseNumber;
    private String postalCode;
    private String townName;
    private String  cityId;


    public Address() {
    }

    public Address(Builder builder) {

        this.addressId = builder.addressId;
        this.streetName = builder.streetName;
        this.houseNumber = builder.houseNumber;
        this.postalCode = builder.postalCode;
        this.townName = builder.townName;
        this.cityId = builder.cityId;

    }

    public String getAddressId() {
        return addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getTownName() {
        return townName;
    }

    public String getCityId() {
        return cityId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", streetName='" + streetName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", townName='" + townName + '\'' +
                ", cityId=" + cityId +
                '}';
    }

    public static class Builder{
        private String addressId;
        private String streetName;
        private String houseNumber;
        private String postalCode;
        private String townName;
        private String cityId;

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;

            return this;
        }

        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;

            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;

            return this;
        }

        public Builder setTownName(String townName) {
            this.townName = townName;

            return this;
        }

        public Builder setCityId(String cityId) {
            this.cityId = cityId;

            return this;
        }

        public Builder copy(Address address){

            this.addressId = address.addressId;
            this.streetName = address.streetName;
            this.houseNumber = address.houseNumber;
            this.postalCode = address.postalCode;
            this.townName = address.townName;
            this.cityId = address.cityId;
            return this;

        }

        public Address build(){

            return new Address(this);
        }

    } // builder

}
