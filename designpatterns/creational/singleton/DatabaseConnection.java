package designpatterns.creational.singleton;

class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Private constructor prevents external instantiation
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("SQL Query ran: " + sql);
    }
}
