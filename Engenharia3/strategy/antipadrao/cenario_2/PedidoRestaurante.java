package cenario_2;

public class PedidoRestaurante {
    private double subtotal;
    private String tipoEntrega;
    private double distanciaKm;

    public PedidoRestaurante(double subtotal, String tipoEntrega, double distanciaKm) {
        this.subtotal = subtotal;
        this.tipoEntrega = tipoEntrega;
        this.distanciaKm = distanciaKm;
    }

    public double calcularTotal() {
        if (tipoEntrega.equals("retirada")) {
            return subtotal;
        } else if (tipoEntrega.equals("motoboy")) {
            return subtotal + 7.00 + distanciaKm * 1.20;
        } else if (tipoEntrega.equals("expressa")) {
            return subtotal + 15.00 + distanciaKm * 2.00;
        } else {
            throw new IllegalArgumentException("Tipo de entrega desconhecido: " + tipoEntrega);
        }
    }
}
