package cenario_1;

public class Main {
    public static void main(String[] args) {
        AssinaturaStreaming assinatura = new AssinaturaStreaming("familia", 2);
        System.out.println("Mensalidade: R$" + assinatura.calcularMensalidade());
    }
}
