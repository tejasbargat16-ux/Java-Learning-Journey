public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final String city;
    private final double salary;
    private final int age;

    public Employee(int id, String name, String department,
                    String city, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.city = city;
        this.salary = salary;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + department + ", " + (int) salary + ")";
    }
}