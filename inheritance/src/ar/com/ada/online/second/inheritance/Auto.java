package ar.com.ada.online.second.inheritance;

public class Auto extends Transporte {

    private String patent;
    private String brand;

    public Auto() {
    }

    public Auto(String patent, String brand) {
        this.patent = patent;
        this.brand = brand;
    }

    public Auto(Integer seats, String patent, String brand) {
        super(seats);
        this.patent = patent;
        this.brand = brand;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format(
                "Auto { patent = %s, brand = %s, seats = %d }",
                this.patent,
                this.brand,
                this.getSeats()
        );
    }
}
