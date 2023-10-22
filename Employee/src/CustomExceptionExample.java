import java.util.Scanner;

public class CustomExceptionExample {
    public static void main(String[] args) throws CustomException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir tam sayı girin (x): ");
            int x = scanner.nextInt();

            if (x > 100) {
                throw new CustomException(x);
            }

            System.out.println("Girilen sayı: " + x);
        }
        
    }
}
