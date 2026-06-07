package cenario_2;

public class EntregaExpressa implements Entrega {
    @Override
    public double calcularTaxa(double distanciaKm) {
        return 15.00 + distanciaKm * 2.00;
    }
}
