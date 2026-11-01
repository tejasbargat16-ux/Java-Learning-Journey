import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate startDate =
                LocalDate.of(2026, 1, 1);

        LocalDate endDate =
                LocalDate.of(2026, 11, 1);

        Period difference =
                Period.between(startDate, endDate);

        System.out.println(
                "Years: " + difference.getYears()
        );

        System.out.println(
                "Months: " + difference.getMonths()
        );

        System.out.println(
                "Days: " + difference.getDays()
        );
    }
}
