package ar.com.ada.online.second.polymorphism;

import java.util.Objects;
import java.util.Scanner;

public class Teacher extends Person {

    private String area;
    private String matter;

    public Teacher() {
    }

    public Teacher(String area, String matter) {
        this.area = area;
        this.matter = matter;
    }

    public Teacher(String name, String lastName, String area, String matter) {
        super(name, lastName);
        this.area = area;
        this.matter = matter;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public void showRedordFile() {
        System.out.println("Expediente del Profesor: ");
        System.out.printf("Nombre: %s\n", getName());
        System.out.printf("Apellido: %s\n", getLastName());
        System.out.printf("Area: %s\n", this.area);
        System.out.printf("Materia: %s\n", this.matter);
        System.out.print("\n");
    }

    public static Teacher createTeacher(Scanner keyboard) {
        System.out.printf("Ingrese el nombre del prof");
        String name = keyboard.nextLine();

        System.out.printf("Ingrese el apellido del prof");
        String lastName = keyboard.nextLine();

        System.out.printf("Ingrese el are del prof");
        String area = keyboard.nextLine();

        System.out.printf("Ingrese la materia del prof");
        String matter = keyboard.nextLine();

        return new Teacher(name, lastName, area, matter);
    }


    @Override
    public String toString() {
        return String.format(
                "Teacher { area= %s, matter= %s, name= %s, lastName= %s }",
                this.area,
                this.matter,
                getName(),
                getLastName()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher that = (Teacher) obj;
        return super.equals(obj) &&
                matter.equals(that.matter) &&
                area.equals(that.matter);
    }

    @Override
    public int hashCode() {
        return 35 * Objects.hash(super.hashCode(), matter, area);
    }
}
