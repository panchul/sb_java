public class BasicsExample {
    public static void main(String[] args) {
        int age = 20;
        double price = 19.99;
        boolean isStudent = true;

        double discountedPrice = isStudent ? price * 0.9 : price;

        System.out.println("Age: " + age);
        System.out.println("Original price: " + price);
        System.out.println("Discounted price: " + discountedPrice);
    }
}
