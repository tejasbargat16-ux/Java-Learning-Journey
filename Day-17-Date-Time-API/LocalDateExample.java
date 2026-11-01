import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate birthday =
                LocalDate.of(2007, 5, 30);

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);

        System.out.println(
                "Year: " + today.getYear()
        );

        System.out.println(
                "Month: " + today.getMonth()
        );

        System.out.println(
                "Day: " + today.getDayOfMonth()
        );
    }
}
