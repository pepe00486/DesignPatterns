package designpatterns.observer;

public class DBClient implements Client {
    private String username;

    public DBClient() {
        username = "";
    }

    public static DBClient buildDBClient(DB DB) {
        DBClient obj = new DBClient();
        DB.add(obj);
        return obj;
    }

    @Override
    public void update(String username) {
        this.username = username;
    }
}
