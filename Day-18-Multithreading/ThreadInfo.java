
public class ThreadInfo {
    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println(
                "Running: " +
                Thread.currentThread().getName()
            );
        });

        t1.setName("NEXUS-Worker");

        System.out.println("Before start: " + t1.isAlive());

        t1.start();

        System.out.println("After start: " + t1.isAlive());

        t1.join();

        System.out.println("After completion: " + t1.isAlive());
    }
}
