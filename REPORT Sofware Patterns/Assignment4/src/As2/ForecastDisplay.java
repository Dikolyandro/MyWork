package As2;
public class ForecastDisplay implements WeatherDisplay {
    private double lastPressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (pressure > lastPressure) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (pressure < lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather.");
        } else {
            System.out.println("Forecast: More of the same.");
        }
        lastPressure = pressure;
    }
}

