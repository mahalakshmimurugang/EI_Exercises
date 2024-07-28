public class HumidityDisplay implements Display {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Humidity: " + humidity + "%");
    }
}