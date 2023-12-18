package Animals;

public class Cat extends Animal{
    public String voice;
    public String breed;
    public String weight;
    public Cat(String voice, String breed, String weigth, String food, String location){
        super(food, location);
        this.voice=voice;
        this.breed=breed;
        this.weight=weigth;
    }
}
