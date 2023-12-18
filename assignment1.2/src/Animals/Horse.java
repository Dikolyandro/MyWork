package Animals;

public class Horse extends Animal{
    public String voice;
    public String breed;
    public String weight;
    public Horse(String voice, String breed, String weigth, String food, String location){
        super(food, location);
        this.voice=voice;
        this.breed=breed;
        this.weight=weigth;
    }
}
