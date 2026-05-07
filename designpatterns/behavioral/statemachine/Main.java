package designpatterns.behavioral.statemachine;

public class Main {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();

        machine.selectProduct();  // "Insert coin first"
        machine.insertCoin();     // "Coin inserted"
        machine.selectProduct();  // "Product selected"
        machine.dispense();       // "Dispensing product"
    }
}
