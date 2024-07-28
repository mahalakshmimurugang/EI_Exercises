public class TemperatureDisplay implements Display {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Temperature: " + temperature + "°C");
    }
}