package designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.query("SELECT * FROM users");
    }
}
