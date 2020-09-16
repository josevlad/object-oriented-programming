package ar.com.ada.online.second.inheritance;

public class Main {

    public static void main(String[] args) {

        Auto mustang = new Auto(4 ,"QWE-123", "Ford Mustang");
        Airplane jet = new Airplane("Turbina", "jet-123", 2);

        System.out.println("mustang: " + mustang.toString());
        System.out.println("jet: " + jet.toString());

        mustang.setSeats(2);
        jet.setSeats(8);

        System.out.println("mustang: " + mustang.toString());
        System.out.println("jet: " + jet.toString());

    }
}
