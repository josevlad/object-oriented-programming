package ar.com.ada.online.second.geometricalfigure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        menu(figures, keyboard);
        showResults(figures);

//        Integer myVar = 10;

        // myVar == con respecto al los casos dentro del switch
//        switch (myVar) {
//            case 1:
//                System.out.println("La variables es de valor 1");
//                break;
//            case 2:
//                System.out.println("La variables es de valor 2");
//                break;
//            default:
//                System.out.println("bloque de codigo que se ejecuta cuando la comparacion de coincide con algun caso");
//        }


    }

    public static void menu(ArrayList<Figure> figures, Scanner keyboard) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor elija una figura:\n\t1) Circulo\n\t2) Rectangulo\n\t3) Triangulo");
            int option = keyboard.nextInt();

            // si option == 1 ejecuta caso 1
            // si option == 2 ejecuta caso 2
            // si option == 3 ejecuta caso 3
            // si option != 1,2 y 3 ejecuta default
            switch (option) {
                case 1:
                    Circle circle = createCircle(keyboard);
                    figures.add(circle);
                    break;
                case 2:
                    Rectangle rectangle = createRectangle(keyboard);
                    figures.add(rectangle);
                    break;
                case 3:
                    Triangle triangle = createTriangle(keyboard);
                    figures.add(triangle);
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        }
    }

    public static Circle createCircle(Scanner keyboard) {
        Circle circle = new Circle();

        System.out.println("Ingrese el radio del Circulo: ");
        Double radio = keyboard.nextDouble();

        circle.setRadio(radio);
        return circle;
    }

    public static Rectangle createRectangle(Scanner keyboard) {
        Rectangle rectangle = new Rectangle();

        System.out.println("Ingrese la base del Rectangulo: ");
        Double base = keyboard.nextDouble();

        System.out.println("Ingrese la altura del Rectangulo: ");
        Double height = keyboard.nextDouble();

        rectangle.setBase(base);
        rectangle.setHeight(height);

        return rectangle;
    }

    public static Triangle createTriangle(Scanner keyboard) {
        Triangle triangle = new Triangle();

        System.out.println("Ingrese la base del Triangulo: ");
        Double base = keyboard.nextDouble();

        System.out.println("Ingrese la altura del Triangulo: ");
        Double height = keyboard.nextDouble();

        triangle.setBase(base);
        triangle.setHeight(height);

        return triangle;
    }

    public static void showResults(ArrayList<Figure> figures) {

        for (Figure figure : figures) {
            figure.calculateArea();

            switch (figure.getClass().getSimpleName()) {
                case "Circle":
                    Circle circle = (Circle) figure;
                    System.out.println("Circulo");
                    System.out.println("\tRadio: " + circle.getRadio());
                    break;
                case "Rectangle":
                    Rectangle rectangle = (Rectangle) figure;
                    System.out.println("Rectangulo");
                    System.out.println("\tBase: " + rectangle.getBase());
                    System.out.println("\tAltura: " + rectangle.getHeight());
                    break;
                case "Triangle":
                    Triangle triangle = (Triangle) figure;
                    System.out.println("Triangulo");
                    System.out.println("\tBase: " + triangle.getBase());
                    System.out.println("\tAltura: " + triangle.getHeight());
                    break;
            }

            System.out.println("\tArea: " + figure.getArea());
        }

        if (hasFigureEquals(figures))
            System.out.println("Existen Figuras iguales");
        else
            System.out.println("No Existen Figuras iguales");
    }

    public static Boolean hasFigureEquals(ArrayList<Figure> figures) {
        boolean equals = false;
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            for (int j = i + 1; j < figures.size(); j++) {
                equals = figure.equals(figures.get(j));
                if (equals) return equals;
            }
        }
        return equals;
    }
}
