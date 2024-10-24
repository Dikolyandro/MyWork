package As2;

public class WeatherData {
    private WeatherStation weatherStation;

    public WeatherData() {
        weatherStation = new WeatherStation();
    }

    public void setNewWeatherData(double temperature, double humidity, double pressure) {
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }

    public void addDisplay(WeatherDisplay display) {
        weatherStation.addObserver(display);
    }

    public void removeDisplay(WeatherDisplay display) {
        weatherStation.removeObserver(display);
    }
}
