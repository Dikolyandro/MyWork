public class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Mooo..");
        }
    }
    public static class Sheep extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Be-be..");
        }
    }
    public static void main (String[] args) {
        Cow cow = new Cow();
        cow.makeSound();

        Sheep sheep = new Sheep();
        sheep.makeSound();
    }
}
