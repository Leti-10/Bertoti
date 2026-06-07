package cenario_1;

public class Main {
    public static void main(String[] args) {
        AssinaturaStreaming assinatura = new AssinaturaStreaming(new PlanoBasico());
        System.out.println("Basico: R$" + assinatura.calcularMensalidade(0));

        assinatura.setPlano(new PlanoFamilia());
        System.out.println("Familia: R$" + assinatura.calcularMensalidade(2));

        assinatura.setPlano(new PlanoPremium());
        System.out.println("Premium: R$" + assinatura.calcularMensalidade(2));
    }
}
