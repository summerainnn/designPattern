/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/21 4:59 ÏÂÎç
 */


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,63,3);
        weatherData.setMeasurements(82,63,3);
        weatherData.setMeasurements(82,67,3);
    }
}
