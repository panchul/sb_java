public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String input = "abc";

        try {
            int value = Integer.parseInt(input);
            System.out.println("Parsed number: " + value);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number: " + input);
        }
    }
}
