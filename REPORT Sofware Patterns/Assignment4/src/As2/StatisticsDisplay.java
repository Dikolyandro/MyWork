package As2;

public class StatisticsDisplay implements WeatherDisplay {
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    private double sumTemp = 0;
    private int numReadings = 0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (temperature > maxTemp) maxTemp = temperature;
        if (temperature < minTemp) minTemp = temperature;
        sumTemp += temperature;
        numReadings++;

        System.out.println("Avg/Max/Min temperature = " + (sumTemp / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
