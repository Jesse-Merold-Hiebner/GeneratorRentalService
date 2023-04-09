package za.ac.cput.domain;

//Author: Adrian Bennett (214075982)

public class Product {

    private long product_id;

    private String serial_number;

    private Double cost;

    private Supplier supplier;


    public Product (Builder builder){

        this.product_id = builder.product_id;
        this.serial_number= builder.serial_number;
        this.cost = builder.cost;
        this.supplier = builder.supplier;

    }

    public long getProduct_id() {
        return product_id;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public Double getCost() {
        return cost;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", serial_number='" + serial_number + '\'' +
                ", cost=" + cost +
                ", supplier=" + supplier +
                '}';
    }

    public static class Builder{

        private long product_id;

        private String serial_number;

        private Double cost;

        private Supplier supplier;

        public Builder setProduct_id(long product_id) {
            this.product_id = product_id;
            return this;
        }

        public Builder setSerial_number(String serial_number) {
            this.serial_number = serial_number;
            return this;
        }

        public Builder setCost(Double cost) {
            this.cost = cost;
            return this;
        }

        public Builder setSupplier(Supplier supplier) {
            this.supplier = supplier;
            return this;
        }


        public Builder copy(Product product){

            this.product_id = product.product_id;
            this.serial_number= product.serial_number;
            this.cost = product.cost;
            this.supplier = product.supplier;

            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }



}
