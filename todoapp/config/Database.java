package todoapp.config;

public class Database {
    private String databaseName;
    private String user;
    private String host;
    private String port;

    public Database(String databaseName, String user, String host, String port) {
        this.databaseName = databaseName;
        this.user = user;
        this.host = host;
        this.port = port;
    }

    public void setup() {
        // Setup database connection
    }
}
