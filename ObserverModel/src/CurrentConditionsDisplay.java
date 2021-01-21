/**
 * @author ：summerain
 * @date ：Created in 2021/1/21 4:50 下午
 */
import javafx.beans.binding.When;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    // 相当于 private Subject weatherData
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }



    @Override
    public void display() {
        System.out.println("Current temperature: " + temperature + " Current humidity: " + humidity
                +"\nThinks for using!");
    }
}
