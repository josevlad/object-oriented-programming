package ar.com.ada.online.second.polymorphic.sub;

import ar.com.ada.online.second.polymorphic.sup.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {

    private Integer rpm;

    public SportsVehicle() {
    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, String year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet() {
        String commentary;

        if (rpm <= 50)
            commentary = "El auto es muy bonito, pero solo sirve para salir a pasear";
        else if (rpm <= 300)
            commentary = "Con este auto puedes desafiar a cualquiera en la pista";
        else if (rpm <= 600)
            commentary = "Si tienes este auto, debe considerar participar en NASCAR";
        else
            commentary = "¿Eres parte del elenco de rápidos y furiosos?";

        return String.format(
                "Informacion tecnica (Vehículo Deportivo):\n\tMarca: %s\n\tModelo: %s\n\tAño: %s\n\t%s",
                brand,
                model,
                year.getValue(),
                commentary
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return super.equals(obj) && rpm.equals(that.rpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rpm);
    }

    @Override
    public String toString() {
        return String.format(
                "SportsVehicle { brand = %s, model = %s, year = %d, rpm = %d }",
                brand,
                model,
                year.getValue(),
                rpm
        );
    }
}
