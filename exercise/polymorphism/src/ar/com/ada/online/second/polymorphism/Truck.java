package ar.com.ada.online.second.polymorphism;

import java.util.Calendar;
import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, String year, Integer maxLoad) throws Exception {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String technicalSheet() {
        String stringByMaxLoad = maxLoad < 100 ?
                "Para iniciar un negocio de flete, está muy bien este auto" :
                "Tienes que usar este auto en el campo, es una máquina de trabajo!!";

        Calendar year = Calendar.getInstance();
        year.setTime(this.year);

        return String.format(
                "Ficha Tecnica del Camion\n brand: %s\n model: %s\n year: %d\n %s",
                this.brand,
                this.model,
                year.get(Calendar.YEAR),
                stringByMaxLoad
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Truck truck = (Truck) obj;
        return super.equals(obj) && maxLoad.equals(truck.maxLoad);
    }

    @Override
    public int hashCode() {
        return -32 * Objects.hash(super.hashCode(), maxLoad);
    }

    @Override
    public String toString() {
        Calendar year = Calendar.getInstance();
        year.setTime(this.year);
        return String.format(
                "Truck { maxLoad = %d, brand = %s, model = %s, year = %d }",
                this.maxLoad,
                this.brand,
                this.model,
                year.get(Calendar.YEAR)
        );
    }
}
