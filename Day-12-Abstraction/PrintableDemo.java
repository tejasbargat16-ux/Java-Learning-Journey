interface Printable {

    void print();
}

class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing report.");
    }
}

class Invoice implements Printable {

    @Override
    public void print() {
        System.out.println("Printing invoice.");
    }
}

public class PrintableDemo {

    public static void main(String[] args) {

        Printable document = new Report();
        document.print();

        document = new Invoice();
        document.print();
    }
}