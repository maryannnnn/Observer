package Patterns.Observer;

public class ForecastDisplay  implements Observers, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("ForecastDisplay: " + temperature*34.5
                + "F degrees and " + humidity*3 + "% humidity " + pressure*67 + " Pa");

    }
}
