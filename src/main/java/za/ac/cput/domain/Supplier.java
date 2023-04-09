package za.ac.cput.domain;

public class Supplier {

    private long supplier_id;

    private String supplier_name;

    private String supplier_contact;

    private String supplier_email;

    private Address address;


    public Supplier(Builder builder){

        this.supplier_id = builder.supplier_id;
        this.supplier_name = builder.supplier_name;
        this.supplier_contact = builder.supplier_contact;
        this.supplier_email = builder.supplier_email;
        this.address = builder.address;

    }

    public long getSupplier_id() {
        return supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public String getSupplier_contact() {
        return supplier_contact;
    }

    public String getSupplier_email() {
        return supplier_email;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplier_id=" + supplier_id +
                ", supplier_name='" + supplier_name + '\'' +
                ", supplier_contact='" + supplier_contact + '\'' +
                ", supplier_email='" + supplier_email + '\'' +
                ", address=" + address +
                '}';
    }


    public static class Builder{

        private long supplier_id;

        private String supplier_name;

        private String supplier_contact;

        private String supplier_email;

        private Address address;


        public Builder setSupplier_id(long supplier_id) {
            this.supplier_id = supplier_id;
            return this;
        }

        public Builder setSupplier_name(String supplier_name) {
            this.supplier_name = supplier_name;
            return this;
        }

        public Builder setSupplier_contact(String supplier_contact) {
            this.supplier_contact = supplier_contact;
            return this;
        }

        public Builder setSupplier_email(String supplier_email) {
            this.supplier_email = supplier_email;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(Supplier supplier){
            this.supplier_id = supplier.supplier_id;
            this.supplier_name = supplier.supplier_name;
            this.supplier_contact = supplier.supplier_contact;
            this.supplier_email = supplier.supplier_email;
            this.address = supplier.address;

            return this;

        }

        public Supplier build(){

            return new Supplier(this);
        }


    }
}
