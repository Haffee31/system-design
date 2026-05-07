package designpatterns.behavioral.statemachine;


interface VendingMachineState {
  void insertCoin(VendingMachine machine);
  void selectProduct(VendingMachine machine);
  void dispense(VendingMachine machine);
}

class NoCoinState implements VendingMachineState {
  public void insertCoin(VendingMachine machine) {
    System.out.println("Coin inserted");
    machine.setState(new HasCoinState());
  }

  public void selectProduct(VendingMachine machine) {
    System.out.println("Insert coin first");
  }

  public void dispense(VendingMachine machine) {
    System.out.println("Insert coin first");
  }
}

class HasCoinState implements VendingMachineState {
  public void insertCoin(VendingMachine machine) {
    System.out.println("Coin already inserted");
  }

  public void selectProduct(VendingMachine machine) {
    System.out.println("Product selected");
    machine.setState(new DispenseState());
  }

  public void dispense(VendingMachine machine) {
    System.out.println("Select product first");
  }
}

class DispenseState implements VendingMachineState {
  public void insertCoin(VendingMachine machine) {
    System.out.println("Please wait, dispensing");
  }

  public void selectProduct(VendingMachine machine) {
    System.out.println("Please wait, dispensing");
  }

  public void dispense(VendingMachine machine) {
    System.out.println("Dispensing product");
    machine.setState(new NoCoinState());
  }
}

class VendingMachine {
  private VendingMachineState currentState;

  public VendingMachine() {
    currentState = new NoCoinState();
  }

  public void insertCoin() {
    currentState.insertCoin(this);
  }

  public void selectProduct() {
    currentState.selectProduct(this);
  }

  public void dispense() {
    currentState.dispense(this);
  }

  public void setState(VendingMachineState state) {
    this.currentState = state;
  }
}


