// WeatherStation.java

import java.util.ArrayList;
import java.util.List;

public class WeatherStation{
    private List<Display> displays;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        displays = new ArrayList<>();
    }

    public void registerDisplay(Display display) {
        displays.add(display);
    }

    public void unregisterDisplay(Display display) {
        displays.remove(display);
    }

    public void notifyDisplays() {
        for (Display display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }
}

