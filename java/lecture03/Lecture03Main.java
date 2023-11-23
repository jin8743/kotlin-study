package java.lecture03;

import java.lecture01.Person;

public class Lecture03Main {

    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object o) {
        if (o instanceof Person person) {
            System.out.println(person.name());
        }
    }

}
