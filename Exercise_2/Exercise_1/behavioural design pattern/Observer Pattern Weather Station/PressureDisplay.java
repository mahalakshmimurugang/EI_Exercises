public class PressureDisplay implements Display {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Pressure: " + pressure + " hPa");
    }
}