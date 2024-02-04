package org.example;
import java.util.List;
import java.util.Optional;

public class Koleksiyon {
    public static <T> T koleksiyonOge(List<T> koleksiyon, T bulunan) {
        Optional<T> result = koleksiyon.stream()
                .filter(item -> item.equals(bulunan))
                .findFirst();

        return result.orElse(null);
    }

}
