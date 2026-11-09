import java.util.Arrays;

public class StringManipulationsExample {
    public static void main(String[] args) {
        String raw = "  Java,python,Go  ";
        String trimmed = raw.trim();
        String upper = trimmed.toUpperCase();
        String replaced = upper.replace("GO", "KOTLIN");
        String[] parts = replaced.split(",");

        System.out.println("Trimmed: " + trimmed);
        System.out.println("Upper case: " + upper);
        System.out.println("Replaced: " + replaced);
        System.out.println("Split: " + Arrays.toString(parts));
        System.out.println("Joined: " + String.join(" | ", parts));
    }
}
