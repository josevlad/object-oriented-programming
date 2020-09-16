package ar.com.ada.online.second.parameters;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Person {

    // attr

    private String name;
    private Integer age;

    // constuctores

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    // getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
