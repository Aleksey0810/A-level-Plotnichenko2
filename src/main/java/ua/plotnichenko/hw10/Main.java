package ua.plotnichenko.hw10;

public class Main {
    public static void main(String[] args) {

        Student Student1 = new Student("Ivanov", "Ivan", "A", 4);
        Student Student2 = new Aspirant("Alekseev", "Alex", "B", 5, "MyJob");
        Aspirant Aspirant1 = new Aspirant("Petrov", "Petr", "C", 5, "MyWork");

        Student[] students = {Student1, Student2, Aspirant1};
        for (Student s : students) {
            System.out.println(s.getLastName() + " " + s.getScholarship());

        }
    }
}

