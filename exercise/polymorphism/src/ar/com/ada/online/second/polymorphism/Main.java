package ar.com.ada.online.second.polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Truck truck1 = new Truck("iveco", "351", "2016", 450);
        Truck truck2 = new Truck("iveco", "350", "2016", 450);

        Vehicle truck = createTruck(keyboard);
        System.out.println(truck.technicalSheet());
    }

    public static Vehicle createVehicle(Scanner keyboard) throws Exception {
        System.out.println("Ingrese la marca del Vehiculo: ");
        String brand = keyboard.nextLine();

        System.out.println("Ingrese el modelo del Vehiculo: ");
        String model = keyboard.nextLine();

        System.out.println("Ingrese el año del Vehiculo: ");
        String year = keyboard.nextLine();

        return new Vehicle(brand, model, year);
    }

    public static Truck createTruck(Scanner keyboard) throws Exception {
        System.out.println("Ingrese la marca del Camion: ");
        String brand = keyboard.nextLine();

        System.out.println("Ingrese el modelo del Camion: ");
        String model = keyboard.nextLine();

        System.out.println("Ingrese el año del Camion: ");
        String year = keyboard.nextLine();

        System.out.println("Ingrese La capacidad maxima del Camion: ");
        Integer maxLoad = Integer.parseInt(keyboard.nextLine());

        return new Truck(brand, model, year, maxLoad);
    }
}
