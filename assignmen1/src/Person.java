public class Person {

    String FullName;

    int age;

    public Person(String FullName, int age) {
        this.FullName = FullName;
        this.age = age;
    }
    public static void main(String[] args) {
        Person pr1 = new Person("Ronaldo",39);
        Person pr2 = new Person("Messi",35);
        pr1.move("Ronaldo", 39);
        pr2.move("Messi", 35);
        pr1.talk("Ronaldo", 39);
        pr2.talk("Messi", 35);

    }
    public void move(String FullName, int age) {
        System.out.println(FullName + " " + age + " years old is moving");
    }
    public void talk(String FullName, int age) {
        System.out.println(FullName + " " + age + " years old is talking");
    }
}
