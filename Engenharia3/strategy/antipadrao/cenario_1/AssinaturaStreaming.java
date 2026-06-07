package cenario_1;

public class AssinaturaStreaming {
    private String plano;
    private int telasExtras;

    public AssinaturaStreaming(String plano, int telasExtras) {
        this.plano = plano;
        this.telasExtras = telasExtras;
    }

    public double calcularMensalidade() {
        if (plano.equals("basico")) {
            return 24.90;
        } else if (plano.equals("familia")) {
            return 39.90 + telasExtras * 6.00;
        } else if (plano.equals("premium")) {
            return 59.90 + telasExtras * 4.00;
        } else {
            throw new IllegalArgumentException("Plano desconhecido: " + plano);
        }
    }
}
