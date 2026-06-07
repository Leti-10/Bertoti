package antipadrao;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        sensor.registrarTemperatura("Servidor-A", 72.5);
        sensor.registrarTemperatura("Servidor-B", 49.0);
    }
}
