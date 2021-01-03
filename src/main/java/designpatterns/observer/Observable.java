package designpatterns.observer;

public interface Observable {
    void notifyObservators(String username);
    void add(Observator observator);
    void remove(Observator observator);
}
