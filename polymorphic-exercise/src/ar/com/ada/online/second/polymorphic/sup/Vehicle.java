package ar.com.ada.online.second.polymorphic.sup;

import java.time.Year;
import java.util.Objects;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected Year year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = Year.parse(year);
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = Year.of(year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public void setYear(String year) {
        this.year = Year.parse(year);
    }

    public void setYear(Integer year) {
        this.year = Year.of(year);
    }

    public abstract String technicalSheet();

    @Override
    public String toString() {
        return String.format(
                "Vehicle { brand = %s, model = %s, year = %d }",
                brand,
                model,
                year.getValue()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return brand.equals(vehicle.brand) &&
                model.equals(vehicle.model) &&
                year.equals(vehicle.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }
}
