package padrao;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        sensor.adicionarObserver(new DashboardTecnico());
        sensor.adicionarObserver(new AlertaSms());
        sensor.adicionarObserver(new RegistroEvento());

        sensor.registrarTemperatura("Servidor-A", 72.5);
        sensor.registrarTemperatura("Servidor-B", 49.0);
    }
}
