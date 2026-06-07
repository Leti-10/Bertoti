package padrao;

public class RegistroEvento implements TemperaturaObserver {
    @Override
    public void atualizar(String servidor, double temperatura) {
        System.out.println("LOG: " + servidor + " atualizado para " + temperatura + " graus");
    }
}
