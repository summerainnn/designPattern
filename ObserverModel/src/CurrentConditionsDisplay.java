/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/21 4:50 ÏÂÎç
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    // Ö÷Ìâ
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature: " + temperature + " Current humidity: " + humidity
                +"\nThinks for using!");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
