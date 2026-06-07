package cenario_1;

public class PlanoFamilia implements PlanoStreaming {
    @Override
    public double calcular(int telasExtras) {
        return 39.90 + telasExtras * 6.00;
    }
}
