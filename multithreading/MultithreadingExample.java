public class MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread worker1 = new Thread(() -> System.out.println("Worker 1 running"));
        Thread worker2 = new Thread(() -> System.out.println("Worker 2 running"));

        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();

        System.out.println("Both workers finished");
    }
}
