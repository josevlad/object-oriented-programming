package ar.com.ada.online.second.tesacamosunojo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner keyboard = new Scanner(System.in);

        menu(shoppingCart, keyboard);
        shoppingCart.generateAndPrintTicket(keyboard);
    }

    static void menu(ShoppingCart shoppingCart, Scanner keyboard) {
        Gondola gondola = new Gondola();
        int continueMenu;
        do {
            System.out.println("Por favor elija una categoria:\n\t1) Alimentos\n\t2) Ropa\n\t3) Juguetes\n\t4) Herramientas:");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = gondola.selectFoodProduct(keyboard);
                    if (food != null)
                        shoppingCart.addProduct(food);
                    break;
                case 2:
                    Clothes clothes = getClothesItem(keyboard);
                    if (clothes != null)
                        shoppingCart.addProduct(clothes);
                    break;
                case 3:
                    Toy toy = gondola.selectToyProduct(keyboard);
                    if (toy != null)
                        shoppingCart.addProduct(toy);
                    break;
                case 4:
                    Tool tool = getToolItem(keyboard);
                    if (tool != null)
                        shoppingCart.addProduct(tool);
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }

            System.out.println("Desea agregar otro producto:\n\t1) SI\n\t2) NO");
            continueMenu = keyboard.nextInt();

        } while (continueMenu == 1);
    }

    static Clothes getClothesItem(Scanner keyboard) {
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
                clothes.setPrice(1800d);
                clothes.setDepartement("unisex");
                break;
            default:
                System.out.println("Debe elejir un opcion valida");
                clothes = null;
        }

        return clothes;
    }

    static Tool getToolItem(Scanner keyboard) {
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
