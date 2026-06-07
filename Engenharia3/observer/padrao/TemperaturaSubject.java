package padrao;

public interface TemperaturaSubject {
    void adicionarObserver(TemperaturaObserver observer);
    void removerObserver(TemperaturaObserver observer);
    void notificarObservers();
}
