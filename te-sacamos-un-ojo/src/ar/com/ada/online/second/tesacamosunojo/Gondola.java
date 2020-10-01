package ar.com.ada.online.second.tesacamosunojo;

import java.util.Scanner;

public class Gondola {

    public Food selectFoodProduct(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Arroz\t\t$50");
        System.out.println("\t2) Fideos\t\t$45");
        System.out.println("\t3) Harina\t\t$60");
        System.out.println("\t4) Atun\t\t$90");

        Food food = new Food();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                food.setName("Arroz");
                food.setPrice(50d);
                break;
            case 2:
                food.setName("Fideos");
                food.setPrice(45d);
                break;
            case 3:
                food.setName("Harina");
                food.setPrice(60d);
                break;
            case 4:
                food.setName("Atun");
                food.setPrice(90d);
                break;
            default:
                System.out.println("Debe elejir un opcion valida");
                food = null;
        }

        return food;
    }

    public Clothes selectClothesProduct(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Zapatos niño\t\t$2000");
        System.out.println("\t2) Vertido\t\t$3500");
        System.out.println("\t3) Camisa Hombre\t\t$1500");
        System.out.println("\t4) Suéter\t\t$1800");

        Clothes clothes = new Clothes();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                clothes.setName("Zapatos");
                clothes.setPrice(2000d);
                clothes.setDepartement("kids");
                break;
            case 2:
                clothes.setName("Vertido");
                clothes.setPrice(3500d);
                clothes.setDepartement("women");
                break;
            case 3:
                clothes.setName("Camisa");
                clothes.setPrice(1500d);
                clothes.setDepartement("men");
                break;
            case 4:
                clothes.setName("Suéter");
                clothes.setPrice(90d);
                clothes.setDepartement("unisex");
                break;
            default:
                System.out.println("Debe elejir un opcion valida");
                clothes = null;
        }

        return clothes;
    }

    public Toy selectToyProduct(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Cartas UNO\t\t$600");
        System.out.println("\t2) Lego 1000 pzs\t\t$1250");
        System.out.println("\t3) PS4\t\t$30000");
        System.out.println("\t4) Barbie\t\t$2000");

        Toy toy = new Toy();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                toy.setName("Cartas UNO");
                toy.setPrice(600d);
                break;
            case 2:
                toy.setName("Lego 1000 pzs");
                toy.setPrice(1250d);
                break;
            case 3:
                toy.setName("PS4");
                toy.setPrice(30000d);
                break;
            case 4:
                toy.setName("Barbie");
                toy.setPrice(2000d);
                break;
            default:
                System.out.println("Debe elejir un opcion valida");
                toy = null;
        }

        return toy;
    }

    public Tool selectToolProduct(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Taladro\t\t$5000");
        System.out.println("\t2) Llave ajustable\t\t$950");
        System.out.println("\t3) Pala de Jardineria\t\t$700");
        System.out.println("\t4) Martillo\t\t$1500");

        Tool tool = new Tool();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                tool.setName("Taladro");
                tool.setPrice(5000d);
                break;
            case 2:
                tool.setName("Llave ajustable");
                tool.setPrice(950d);
                break;
            case 3:
                tool.setName("Pala de Jardineria");
                tool.setPrice(700d);
                break;
            case 4:
                tool.setName("Martillo");
                tool.setPrice(1500d);
                break;
            default:
                System.out.println("Debe elejir un opcion valida");
                tool = null;
        }

        return tool;
    }
}
