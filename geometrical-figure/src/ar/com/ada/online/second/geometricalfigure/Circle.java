package ar.com.ada.online.second.geometricalfigure;

import java.util.Objects;

public class Circle extends Figure {

    private Double radio;

    public Circle() {
    }

    public Circle(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return super.equals(obj) &&
                radio.equals(that.radio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public String toString() {
        return String.format(
                "Circle { radio = %f, area = %f }",
                radio,
                area
        );
    }
}
