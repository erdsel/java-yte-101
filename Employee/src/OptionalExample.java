import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        
        Optional<String> optionalValue = Optional.of("Merhaba, Dünya!");

        
        String deger = optionalValue.get();
        System.out.println(deger);

        
        if (optionalValue.isPresent()) {
            System.out.println("Değer mevcut.");
        } else {
            System.out.println("Değer yok.");
        }
    }
}
