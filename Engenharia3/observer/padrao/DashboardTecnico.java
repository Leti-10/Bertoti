package padrao;

public class DashboardTecnico implements TemperaturaObserver {
    @Override
    public void atualizar(String servidor, double temperatura) {
        System.out.println("DASHBOARD: " + servidor + " agora marca " + temperatura + " graus");
    }
}
