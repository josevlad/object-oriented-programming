package ar.com.ada.online.second.polymorphic.sub;

import ar.com.ada.online.second.polymorphic.sup.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, String year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
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
        String headerTxt = "Informacion tecnica (Camion):\n\t";
        return maxLoad < 100 ?
                headerTxt + "Para iniciar un negocio de flete, está muy bien este auto" :
                headerTxt + "Tienes que usar este auto en el campo, es una máquina de trabajo!!";
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
        return Objects.hash(super.hashCode(), maxLoad);
    }

    @Override
    public String toString() {
        return String.format(
                "Truck { brand = %s, model = %s, year = %d, maxLoad = %d }",
                brand,
                model,
                year.getValue(),
                maxLoad
        );
    }
}
