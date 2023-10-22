public class CustomException extends Exception {
    public CustomException(int x) {
        super("Error: " + x);
    }
}
