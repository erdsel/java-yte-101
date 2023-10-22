
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapExample {
    public static void main(String[] args) {
        Stream<String> kelimeler = Stream.of("Merhaba", "Java", "Dünya");

        Map<String, Integer> kelimeUzunlukMap = kelimeler.collect(
            Collectors.toMap(
                kelime -> kelime,
                kelime -> kelime.hashCode()
            )
        );

        System.out.println(kelimeUzunlukMap);
    }
}
