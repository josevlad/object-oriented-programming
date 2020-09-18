package ar.com.ada.online.second.polymorphic.sub;

import ar.com.ada.online.second.polymorphic.sup.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {

    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, String year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String technicalSheet() {
//        String msg;
//
//        if (year.getValue() < 2007) {
//            msg = "Informacion tecnica (Vehículo Electrico):\n\tNo existe modelo para este año";
//        } else {
//            msg = String.format(
//                    "Informacion tecnica (Vehículo Electrico):\n\tMarca: %s\n\tModelo: %s\n\tAño: %s\n\tEste es un auto de última tecnología!",
//                    brand,
//                    model,
//                    year.getValue()
//            );
//        }
//        return msg;

        return year.getValue() < 2007 ?
                "Informacion tecnica (Vehículo Electrico):\n\tNo existe modelo para este año" :
                String.format(
                        "Informacion tecnica (Vehículo Electrico):\n\tMarca: %s\n\tModelo: %s\n\tAño: %s\n\tEste es un auto de última tecnología!",
                        brand,
                        model,
                        year.getValue()
                );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return super.equals(obj) && potency.equals(that.potency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potency);
    }

    @Override
    public String toString() {
        return String.format(
                "ElectricalVehicle { brand = %s, model = %s, year = %d, potency = %d }",
                brand,
                model,
                year.getValue(),
                potency
        );
    }
}
