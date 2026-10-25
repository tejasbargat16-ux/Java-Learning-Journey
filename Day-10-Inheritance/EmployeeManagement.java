public class EmployeeManagement {
    public static void main(String[] args) {
        Developer developer =
                new Developer(
                        "Tejas",
                        101,
                        "Java"
                );

        System.out.println("=== DEVELOPER DETAILS ===");
        developer.displayDetails();
        developer.writeCode();
    }
}
