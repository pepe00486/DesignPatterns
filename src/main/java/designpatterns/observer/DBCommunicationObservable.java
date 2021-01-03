package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DBCommunicationObservable implements Observable {
    final List<Observator> observatorsList;

    public DBCommunicationObservable() {
        observatorsList = new ArrayList<>();
    }

    @Override
    public void notifyObservators(String username) {
        for (Observator observator : observatorsList) {
            observator.update(username);
        }

    }

    @Override
    public void add(Observator observator) {
        observatorsList.add(observator);
    }

    @Override
    public void remove(Observator observator) {
        observatorsList.remove(observator);
    }
}
