package cenario_2;

public class Main {
    public static void main(String[] args) {
        PedidoRestaurante pedido = new PedidoRestaurante(80.00, "motoboy", 3.5);
        System.out.println("Total: R$" + pedido.calcularTotal());
    }
}
