package ar.com.ada.online.second.myfirstobject;


/**
 * Plantilla para crear objetos de tipo Person
 */
public class Person {

    String name;
    String lastName;

    void showAttributesValues() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + this.lastName);
    }

    void showAttrName() {
        System.out.println("Name: " + name);
    }

    void showAttrLastName() {
        System.out.println("Last Name: " + this.lastName);
    }


}
