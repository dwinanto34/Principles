package design_patterns.behavioral.state.vending_machine_state;

import design_patterns.behavioral.state.VendingMachine;

public class DispensingState implements State {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, already dispensing.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject, already dispensing.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Already dispensing.");
    }

    @Override
    public void dispense() {
        vendingMachine.releaseProduct();
        if (vendingMachine.getCount() > 0) {
            vendingMachine.setState(vendingMachine.getNoCoinState());
        } else {
            System.out.println("Out of products.");
            vendingMachine.setState(vendingMachine.getSoldOutState());
        }
    }
}
