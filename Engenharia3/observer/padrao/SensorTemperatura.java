package padrao;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura implements TemperaturaSubject {
    private List<TemperaturaObserver> observers = new ArrayList<>();
    private String servidor;
    private double temperatura;

    public void registrarTemperatura(String servidor, double temperatura) {
        this.servidor = servidor;
        this.temperatura = temperatura;
        notificarObservers();
    }

    @Override
    public void adicionarObserver(TemperaturaObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(TemperaturaObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (TemperaturaObserver observer : observers) {
            observer.atualizar(servidor, temperatura);
        }
    }
}
