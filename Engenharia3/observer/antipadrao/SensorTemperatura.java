package antipadrao;

public class SensorTemperatura {
    private String servidor;
    private double temperatura;

    public void registrarTemperatura(String servidor, double temperatura) {
        this.servidor = servidor;
        this.temperatura = temperatura;

        System.out.println("DASHBOARD: " + servidor + " esta com " + temperatura + " graus");
        System.out.println("SMS: alerta de temperatura no servidor " + servidor);
        System.out.println("LOG: leitura registrada para " + servidor + ": " + temperatura);
    }
}
