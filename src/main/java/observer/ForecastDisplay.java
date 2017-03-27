package observer;

/**
 * Created by Tao on 12/21/2016.
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure=29.2f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData)
    {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature,float humitidy,float pressure)
    {
        lastPressure=currentPressure;
        currentPressure=pressure;
        display();
    }

    public void display()
    {
        System.out.println("Forecast: ");
        if(currentPressure>lastPressure){
            System.out.println("Improving weather on the way");
        }else if(currentPressure==lastPressure){
            System.out.println("More of the same");
        }else if(currentPressure<lastPressure){
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
