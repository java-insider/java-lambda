package api;

import java.util.Map;

public class AppOptional3 {

    public static void main(String[] args) {

        People people = new People(Map.of(
            1, "Paulo",
            2, "Afonso",
            3, "Ricardo",
            4, "Rodrigo"
        ));

        people
            .getNameById(5)
            .ifPresentOrElse(
                n -> System.out.println(n.toUpperCase()),
                () -> System.out.println("ID not found")
            );
    }
}
