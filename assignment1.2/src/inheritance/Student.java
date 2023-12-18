package inheritance;

public class Student {
    public String firstname;
    public String lastname;
    public String group;
    public double averageMark;

    public Student(String firstname, String lastname, String group, double averageMark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
