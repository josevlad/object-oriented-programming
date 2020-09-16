package ar.com.ada.online.second.polymorphism;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Date year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String year) throws Exception {
        this.brand = brand;
        this.model = model;
        this.year = new SimpleDateFormat("yyyy").parse(year);
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String technicalSheet() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.year);
        return String.format(
                "Vehicle:\n Marca: %s\n Modelo: %s\n Año: %s \n Este vehículo no tiene categoría asignada",
                this.brand,
                this.model,
                calendar.get(Calendar.YEAR)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return brand.equals(vehicle.brand) &&
                model.equals(vehicle.model) &&
                year.equals(vehicle.year);
    }

    @Override
    public int hashCode() {
        return 50 * Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        Calendar year = Calendar.getInstance();
        year.setTime(this.year);
        return String.format(
                "Vehicle { brand = %s, model = %s, year = %d }",
                this.brand,
                this.model,
                year.get(Calendar.YEAR)
        );
    }
}
