package designpatterns.observer;

public class DBMock {
    String username;
    Observable dbCommunication;

    public DBMock(Observable dbCommunication) {
        this.dbCommunication = dbCommunication;
        username = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        dbCommunication.notifyObservators(username);
    }
}
