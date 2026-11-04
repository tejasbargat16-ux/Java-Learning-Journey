
class TableTask extends Thread {
    private int number;

    TableTask(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                number + " x " + i + " = " + (number * i)
            );
        }
    }
}

public class TableThreadPractice {
    public static void main(String[] args) {
        TableTask table = new TableTask(7);
        table.start();
    }
}
