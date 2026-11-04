
class NumberTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class LetterTask extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
        }
    }
}

public class TwoThreadsPractice {
    public static void main(String[] args) {
        NumberTask t1 = new NumberTask();
        LetterTask t2 = new LetterTask();

        t1.start();
        t2.start();
    }
}
