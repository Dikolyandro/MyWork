package Animals;

public class Dog extends Animal {
    public String voice;
    public String breed;
    public String weight;
    public Dog(String voice, String breed, String weigth, String food, String location){
        super(food, location);
        this.voice=voice;
        this.breed=breed;
        this.weight=weigth;
    }
}
