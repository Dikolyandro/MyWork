package As2;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions: " + temperature + "C degrees, " + humidity + "% humidity, " + pressure + " hPa pressure.");
    }
}
