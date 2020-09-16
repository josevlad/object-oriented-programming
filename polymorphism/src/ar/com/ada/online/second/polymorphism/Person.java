package ar.com.ada.online.second.polymorphism;

public class Person {

    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // definicion original del metodo
    public void showRedordFile() {
        System.out.println("Expediente de Persona: ");
        System.out.printf("Nombre: %s\n", this.name);
        System.out.printf("Apellido: %s\n", this.lastName);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return String.format(
                "Person { name= %s, lastName= %s }",
                this.name,
                this.lastName
        );
    }
}
