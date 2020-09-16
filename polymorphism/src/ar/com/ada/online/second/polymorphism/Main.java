package ar.com.ada.online.second.polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Teacher teacherOne = new Teacher();
//        Teacher teacherTwo = new Teacher();
//
//        Teacher[] teachers = { teacherOne, teacherTwo };

        Teacher[] teachers = new Teacher[2];

        for (int i = 0; i < teachers.length; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Ingrese el nombre del prof");
            String name = keyboard.nextLine();
            System.out.printf("Ingrese el apellido del prof");
            String lastName = keyboard.nextLine();
            System.out.printf("Ingrese el are del prof");
            String area = keyboard.nextLine();
            System.out.printf("Ingrese la materia del prof");
            String matter = keyboard.nextLine();

            teachers[i] = new Teacher(name, lastName, area, matter);
        }

        for (Teacher teacher : teachers) {
            teacher.showRedordFile();
        }

//        Person person = new Person("Juana", "Perez");
//        Teacher teacher = new Teacher("Maria", "Ramirez", "IT", "Algoritmo");
//        Stundent stundent = new Stundent("Pepe", "Martinez", 123456, "Sistemas");
//
//        person.showRedordFile();
//        teacher.showRedordFile();
//        stundent.showRedordFile();

//        Person person = new Person("Juana", "Perez");
//        Person teacher = new Teacher("Maria", "Ramirez", "IT", "Algoritmo");
//        Person stundent = new Stundent("Pepe", "Martinez", 123456, "Sistemas");
//
//        person.showRedordFile();
//        teacher.showRedordFile();
//        stundent.showRedordFile();
    }
}
