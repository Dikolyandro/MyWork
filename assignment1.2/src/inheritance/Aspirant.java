package inheritance;

public class Aspirant extends Student {
    public Aspirant(String firstname, String lastname, String group, double averageMark) {
        super(firstname, lastname, group, averageMark);
    }

    @Override
    public double getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}

