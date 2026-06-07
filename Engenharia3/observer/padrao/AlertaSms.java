package padrao;

public class AlertaSms implements TemperaturaObserver {
    @Override
    public void atualizar(String servidor, double temperatura) {
        if (temperatura >= 70) {
            System.out.println("SMS: temperatura critica no " + servidor + ": " + temperatura + " graus");
        }
    }
}
