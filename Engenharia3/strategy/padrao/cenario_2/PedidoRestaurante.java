package cenario_2;

public class PedidoRestaurante {
    private double subtotal;
    private Entrega entrega;

    public PedidoRestaurante(double subtotal, Entrega entrega) {
        this.subtotal = subtotal;
        this.entrega = entrega;
    }

    public double calcularTotal(double distanciaKm) {
        return subtotal + entrega.calcularTaxa(distanciaKm);
    }
}
