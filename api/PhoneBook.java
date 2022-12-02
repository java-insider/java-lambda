package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private final Map<String, String> entries = new HashMap<>();

    public PhoneBook() {
        entries.put("pedro", "223-444");
        entries.put("maria", "554-555");
        entries.put("ricardo", "888-987");
        entries.put("joana", "336-541");
    }

    public Optional<String> findByName(String name) {
        return Optional.ofNullable(entries.get(name));
    }
}
