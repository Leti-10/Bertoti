package cenario_2;

public class Main {
    public static void main(String[] args) {
        PedidoRestaurante retirada = new PedidoRestaurante(80.00, new EntregaRetirada());
        System.out.println("Retirada: R$" + retirada.calcularTotal(3.5));

        PedidoRestaurante motoboy = new PedidoRestaurante(80.00, new EntregaMotoboy());
        System.out.println("Motoboy: R$" + motoboy.calcularTotal(3.5));

        PedidoRestaurante expressa = new PedidoRestaurante(80.00, new EntregaExpressa());
        System.out.println("Expressa: R$" + expressa.calcularTotal(3.5));
    }
}
