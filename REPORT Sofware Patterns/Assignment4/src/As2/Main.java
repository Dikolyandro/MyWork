package As2;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.addDisplay(currentDisplay);
        weatherData.addDisplay(statisticsDisplay);
        weatherData.addDisplay(forecastDisplay);

        weatherData.setNewWeatherData(20.0, 55, 1003);
        weatherData.setNewWeatherData(30.0, 90, 1025);
        weatherData.setNewWeatherData(21.0, 40, 1009);
    }
}
