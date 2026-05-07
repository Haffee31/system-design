package designpatterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        DataSource source = new FileDataSource("data.txt");

        source = new EncryptionDecorator(source);
        source = new CompressionDecorator(source);
        source.writeData("sensitive info");
// Data gets compressed, then encrypted, then written to file
    }
}
