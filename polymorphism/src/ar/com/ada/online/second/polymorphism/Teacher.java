package ar.com.ada.online.second.polymorphism;

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
}
