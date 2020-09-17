package ar.com.ada.online.second.polymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, String year, Integer potency) throws Exception {
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
    public String technicalSheet() throws Exception {
        String txt;
        if (this.year.before(new SimpleDateFormat("yyyy").parse("2007"))) {
            txt = "No existe modelo para este año";
        } else {
            Calendar year = Calendar.getInstance();
            year.setTime(this.year);

            txt = String.format(
                    "Ficha Tecnica del Camion\n brand: %s\n model: %s\n year: %d\n %s",
                    this.brand,
                    this.model,
                    year.get(Calendar.YEAR),
                    "Es un auto de última tecnología!"
            );
        }
        return txt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return super.equals(o) && potency.equals(that.potency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potency);
    }
}
