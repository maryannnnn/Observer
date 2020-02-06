package Patterns.Observer;

public class StatisticsDisplay  implements Observers, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
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
        System.out.println("StatisticsDisplay: " + temperature/34.89
                + "F degrees and " + humidity/23.9 + "% humidity " + pressure/21.57 + " Pa");

    }
}
