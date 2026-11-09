public class ControlFlowExample {
    public static void main(String[] args) {
        int score = 76;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop step " + i);
        }

        int count = 3;
        while (count > 0) {
            System.out.println("While countdown: " + count);
            count--;
        }
    }
}
