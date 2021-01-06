package designpatterns.observer;

public interface DB {
    void notifyClients(String username);

    void add(Client client);

    void remove(Client client);
}
