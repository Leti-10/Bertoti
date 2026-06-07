package cenario_1;

public class PlanoPremium implements PlanoStreaming {
    @Override
    public double calcular(int telasExtras) {
        return 59.90 + telasExtras * 4.00;
    }
}
