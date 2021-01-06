package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DBCommunication implements DB {
    final List<Client> observatorsList;

    public DBCommunication() {
        observatorsList = new ArrayList<>();
    }

    @Override
    public void notifyClients(String username) {
        for (Client client : observatorsList) {
            client.update(username);
        }

    }

    @Override
    public void add(Client client) {
        observatorsList.add(client);
    }

    @Override
    public void remove(Client client) {
        observatorsList.remove(client);
    }
}
