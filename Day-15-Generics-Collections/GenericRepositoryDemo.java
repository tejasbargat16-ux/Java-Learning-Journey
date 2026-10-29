public class GenericRepositoryDemo {

    public static void main(String[] args) {

        GenericRepository<String> skills =
                new GenericRepository<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("Git");

        System.out.println("Skills: " + skills.getAll());

        skills.remove("Git");

        System.out.println(
                "After removal: " + skills.getAll()
        );

        System.out.println(
                "Contains Java: " + skills.contains("Java")
        );

        System.out.println(
                "Total skills: " + skills.size()
        );

        GenericRepository<Integer> scores =
                new GenericRepository<>();

        scores.add(85);
        scores.add(92);

        System.out.println("Scores: " + scores.getAll());
    }
}