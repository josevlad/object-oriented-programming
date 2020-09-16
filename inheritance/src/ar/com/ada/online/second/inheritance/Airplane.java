package ar.com.ada.online.second.inheritance;

public class Airplane extends Transporte {

    private String motorType;
    private String model;

    public Airplane() {}

    public Airplane(String motorType, String model) {
        this.motorType = motorType;
        this.model = model;
    }

    public Airplane(String motorType, String model, Integer seats) {
        super(seats);
        this.motorType = motorType;
        this.model = model;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format(
                "Airplane { motorType = %s, model = %s, seats = %d }",
                this.motorType,
                this.model,
                this.getSeats()
        );
    }
}
