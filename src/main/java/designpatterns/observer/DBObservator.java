package designpatterns.observer;

public class DBObservator implements Observator {
    private String username;
    private Observable observable;

    public static DBObservator buildDBObserver(Observable observable){
        DBObservator obj = new DBObservator();
        observable.add(obj);
        return obj;
    }
    public DBObservator() {
        username = "";
    }

    @Override
    public void update(String username) {
        this.username = username;
    }
}
