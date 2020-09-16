package ar.com.ada.online.second.parameters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        m1();

        Scanner keyboard = new Scanner(System.in);

        Person vladimir = new Person(27, "Vladimir");

        System.out.printf("main: Nombre: %s\n", vladimir.getName());

        changeName(vladimir);

        System.out.printf("main: Nombre: %s\n", vladimir.getName());
    }

    // ########### paso de variables por valor

    private static void m1() {
        int a = 20;
        System.out.printf("a antes de llamar a m2: %d\n", a);
        m2(a);
        System.out.printf("a despues de llamar a m2: %d\n", a);
    }

    private static void m2(int b) {
        System.out.printf("valor de b al iniciar m2: %d\n", b);
        boolean c = true;
        b++;
        System.out.printf("nuevo valor de b : %d\n", b);
    }

    //########### paso de variables por referencia

    public static void changeName(Person person) {
        System.out.printf("changeName: Nombre inicial: %s\n", person.getName());
        // Caso 1
//        person = new Person("Daniela", 25);

        // Caso 2
        person.setName("Daniela");

        System.out.printf("changeName: Nombre despues del cambio: %s\n", person.getName());
    }
}
