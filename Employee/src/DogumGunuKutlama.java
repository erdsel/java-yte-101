import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunuKutlama {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum gününüzü (YYYY-MM-DD) girin: ");
        String dogumGunuStr = scanner.nextLine();
        scanner.close();

       
        LocalDate dogumGunu = LocalDate.parse(dogumGunuStr);

        
        LocalDateTime suAnkiZaman = LocalDateTime.now();

      
        LocalDate bugun = suAnkiZaman.toLocalDate();

      
        LocalDate buYilDogumGunu = dogumGunu.withYear(bugun.getYear());

       
        if (buYilDogumGunu.isEqual(bugun)) {
            System.out.println("Doğum gününüz bugün! İyi ki doğdunuz!");
        } else if (buYilDogumGunu.isBefore(bugun)) {
            // Eğer doğum günü bu yıl geçtiyse, bir sonraki yılın doğum gününü hesapla
            LocalDate gelecekYilDogumGunu = buYilDogumGunu.plus(1, ChronoUnit.YEARS);
            long kacGunKaldi = ChronoUnit.DAYS.between(bugun, gelecekYilDogumGunu);
            System.out.println("Doğum gününüz " + kacGunKaldi + " gün sonra!");
        } else {
            long kacGunKaldi = ChronoUnit.DAYS.between(bugun, buYilDogumGunu);
            System.out.println("Doğum gününüz " + kacGunKaldi + " gün sonra!");
        }
    }
}
