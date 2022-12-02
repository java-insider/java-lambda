package api;

import java.util.Optional;

public class AppOptional8 {

    // NO!!!
    private Optional<String> id = Optional.empty();

    // NO!!!
    public void sum(Optional<Integer> v1, Optional<Integer> v2) {

    }

    // YES :))
    public Optional<Integer> getNumber() {
        return Optional.of(1);
    }
}
