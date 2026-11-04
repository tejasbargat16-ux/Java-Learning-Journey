
class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker: " + i);
        }
    }
}

public class JoinExample {
    public static void main(String[] args)
            throws InterruptedException {

        Worker worker = new Worker();

        worker.start();
        worker.join();

        System.out.println("Worker completed!");
    }
} // <-- Missing in the snippet
