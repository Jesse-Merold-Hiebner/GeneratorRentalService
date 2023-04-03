package za.ac.cput.domain;
/*
Entity : City.java
 Author: Mahad Hassan  (219122822)
Date: 30/03/2023
 */
public class City {

    private String cityId;
    private String cityName;
    private String countryName;

    public City() {


    }

    public City(Builder builder) {
        this.cityId = builder.cityId;
        this.cityName = builder.cityName;
        this.countryName = builder.countryName;

    } // builder cons


    public String getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public static class Builder{
        private String cityId;
        private String cityName;
        private String countryName;

        public Builder setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }

        public Builder setCityName(String cityName) {
            this.cityName = cityName;
            return this;

        }

        public Builder setCountryName(String countryName) {
            this.countryName = countryName;

            return this;
        }
        public Builder copy(City city){
            this.cityId = city.cityId;
            this.cityName = city.cityName;
            this.countryName = city.countryName;

            return this;

        } // copy method

        public City build(){
            return new City(this);
        }


    } // builder class
}
