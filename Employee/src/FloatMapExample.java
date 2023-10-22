import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FloatMapExample {
    public static void main(String[] args) {
        List<String> kelimeler = Stream.of("Merhaba", "Java", "Dünya")
                .flatMap(kelime -> Stream.of(kelime.split("")))
                .collect(Collectors.toList());

        System.out.println(kelimeler);
    }
}
