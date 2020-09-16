package ar.com.ada.online.second.polymorphism;

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
}
