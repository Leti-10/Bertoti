package cenario_1;

public class AssinaturaStreaming {
    private PlanoStreaming plano;

    public AssinaturaStreaming(PlanoStreaming plano) {
        this.plano = plano;
    }

    public void setPlano(PlanoStreaming plano) {
        this.plano = plano;
    }

    public double calcularMensalidade(int telasExtras) {
        return plano.calcular(telasExtras);
    }
}
