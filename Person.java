public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public class Student extends Person {
        private int studentID;
        public Student(String name, int age, int studentID) {
            super(name, age);
            this.studentID = studentID;
        }

        public int getStudentID() {
            return studentID;
        }

    }
    public void callName() {
        System.out.println("Name: " + name);
    }
    public void callAge() {
        System.out.println("Age: " + age);
    }
    public void callID() {

        Student student1 = new Student("Damir", 18, 230554);
        System.out.println("Student ID: " + student1.getStudentID());
    }
    public static void main(String[] args) {
        Person person1 = new Person("Damir", 18);

        Student student1 = person1.new Student("Damir", 18, 230554);
        student1.callName();
        student1.callAge();
        student1.callID();
    }
}
