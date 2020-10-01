package ar.com.ada.online.second.tesacamosunojo;

import java.util.Objects;

public abstract class Product {

    protected String name;
    protected Double price;
    protected Double discount;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public abstract void calculateDiscount();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) &&
                price.equals(product.price) &&
                discount.equals(product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, discount);
    }
}
