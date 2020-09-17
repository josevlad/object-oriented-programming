package ar.com.ada.online.second.polymorphism;

import java.util.Objects;
import java.util.Scanner;

public class Stundent extends Person {

    private Integer enrolmnet;
    private String career;

    public Stundent() {
    }

    public Stundent(Integer enrolmnet, String career) {
        this.enrolmnet = enrolmnet;
        this.career = career;
    }

    public Stundent(String name, String lastName, Integer enrolmnet, String career) {
        super(name, lastName);
        this.enrolmnet = enrolmnet;
        this.career = career;
    }

    public Integer getEnrolmnet() {
        return enrolmnet;
    }

    public void setEnrolmnet(Integer enrolmnet) {
        this.enrolmnet = enrolmnet;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void showRedordFile() {
        System.out.println("Expediente del Estudiante: ");
        System.out.printf("Nombre: %s\n", getName());
        System.out.printf("Apellido: %s\n", getLastName());
        System.out.printf("Matricula: %d\n", this.enrolmnet);
        System.out.printf("Carrera: %s\n", this.career);
        System.out.print("\n");
    }

    public static Stundent createStundent(Scanner keyboard) {
        System.out.printf("Ingrese el nombre del Estudiante");
        String name = keyboard.nextLine();

        System.out.printf("Ingrese el apellido del Estudiante");
        String lastName = keyboard.nextLine();

        System.out.printf("Ingrese la matricula del Estudiante");
        Integer enrolmnet = Integer.parseInt(keyboard.nextLine());

        System.out.printf("Ingrese la carrera del Estudiante");
        String career = keyboard.nextLine();

        return new Stundent(name, lastName, enrolmnet, career);
    }

    @Override
    public String toString() {
        return String.format(
                "Stundent { enrolmnet= %d, career= %s, name= %s, lastName= %s }",
                this.enrolmnet,
                this.career,
                getName(),
                getLastName()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stundent that = (Stundent) obj;
        return super.equals(obj) &&
                enrolmnet.equals(that.enrolmnet) &&
                career.equals(that.career);
    }

    @Override
    public int hashCode() {
        return 30 * Objects.hash(super.hashCode(), enrolmnet, career);
    }
}
