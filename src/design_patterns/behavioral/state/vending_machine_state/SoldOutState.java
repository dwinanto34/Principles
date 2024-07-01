package design_patterns.behavioral.state.vending_machine_state;

import design_patterns.behavioral.state.VendingMachine;

public class SoldOutState implements State {
    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No products available.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    @Override
    public void selectProduct() {
        System.out.println("No products available.");
    }

    @Override
    public void dispense() {
        System.out.println("No products available.");
    }
}
