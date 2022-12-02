package api;

import java.util.Map;

public class AppOptional4 {

    public static void main(String[] args) {

        People people = new People(Map.of(
            1, "Paulo",
            2, "Afonso",
            3, "Ricardo",
            4, "Rodrigo"
        ));

        // String name = people.getNameById(3).orElse("X");
        // String name = people.getNameById(3).orElseGet(() -> "X");
        // String name = people.getNameById(6).orElseThrow(() -> new RuntimeException("ID not found"));
        String name = people.getNameById(6).orElseThrow(RuntimeException::new);
        System.out.println(name);
    }
}
