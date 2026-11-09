public class MethodsExample {
    public static void main(String[] args) {
        System.out.println(greet("Java Learner"));
        System.out.println("4 + 7 = " + add(4, 7));
    }

    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    static int add(int a, int b) {
        return a + b;
    }
}
