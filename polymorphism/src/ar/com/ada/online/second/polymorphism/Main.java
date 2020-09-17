package ar.com.ada.online.second.polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Teacher teacherOne = new Teacher();
//        Teacher teacherTwo = new Teacher();
//
//        Teacher[] teachers = { teacherOne, teacherTwo };

        Scanner keyboard = new Scanner(System.in);
        Teacher[] teachers = new Teacher[2];
        Stundent[] stundents = new Stundent[2];

        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = Teacher.createTeacher(keyboard);
            stundents[i] = Stundent.createStundent(keyboard);
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
