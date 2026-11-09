class Car {
    private final String model;

    Car(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }
}

public class OopExample {
    public static void main(String[] args) {
        Car car = new Car("Sedan");
        System.out.println("Created car model: " + car.getModel());
    }
}
