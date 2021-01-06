package designpatterns.observer;

public class DBMock {
    String username;
    DB dbCommunication;

    public DBMock(DB dbCommunication) {
        this.dbCommunication = dbCommunication;
        username = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        dbCommunication.notifyClients(username);
    }
}
