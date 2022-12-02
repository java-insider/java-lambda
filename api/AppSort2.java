package api;

import java.util.Arrays;
import java.util.Comparator;

public class AppSort2 {

    public static void main(String[] args) {
        var people = Arrays.asList(
            new Person("Pedro", 25),
            new Person("Paulo", 40),
            new Person("Joana", 34),
            new Person("Maria", 30),
            new Person("Paulo", 27)
        );

        people.sort(Comparator.comparing(Person::name).thenComparing(Person::age));
        //people.sort(Comparator.comparing(Person::age).reversed());

        people.forEach(p -> System.out.println(p.name() + " - " + p.age));
    }

    record Person(String name, int age) {}
}
