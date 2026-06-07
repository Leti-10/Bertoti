package cenario_2;

public class EntregaMotoboy implements Entrega {
    @Override
    public double calcularTaxa(double distanciaKm) {
        return 7.00 + distanciaKm * 1.20;
    }
}
