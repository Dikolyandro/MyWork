package inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Damir", "Syzdykov", "GroupA", 4.1);
        Aspirant aspirant = new Aspirant("Adil", "Baltabaev", "GroupB", 5.0);

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
