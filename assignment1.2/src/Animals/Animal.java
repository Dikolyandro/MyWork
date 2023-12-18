package Animals;

public class Animal {
    public String food;
    public String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public void makeNoise(String voice) {
        System.out.println("Voice of " + voice);
    }
    public void eat(String breed, String food) {
        System.out.println(breed + " is eating: " + food);
    }
    public void sleep(String location, String breed) {
        System.out.println(breed + " is sleeping in: " + location);
    }
    public static void testAnimal(Animal animal) {
        System.out.println("Food: " + animal.food);
        System.out.println("Location: " + animal.location);
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bark", "Chubokabra", "25", "bone", "Streets");
        Cat cat1 = new Cat("Meow", "Mousehunter", "20", "rabbit meat", "underhouse");
        Horse horse1 = new Horse("Frr", "Tulpar", "420", "Grass", "Openspace");
        Animal[] animal1= {new Dog("Bark", "Chubokabra", "25", "bone", "Streets"),
                new Cat("Meow", "Mousehunter", "20", "rabbit meat", "underhouse"),
                new Horse("Frr", "Tulpar", "420", "Grass", "Openspace")
        };
        dog1.makeNoise(dog1.voice);
        cat1.eat(cat1.breed, cat1.food);
        horse1.sleep(horse1.location, horse1.breed);
        for (Animal animal : animal1) {
            testAnimal(animal);
            System.out.println(" ");
        }
    }
}
