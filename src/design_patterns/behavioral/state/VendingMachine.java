package design_patterns.behavioral.state;

import design_patterns.behavioral.state.vending_machine_state.*;

public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State dispensingState;
    private State soldOutState;

    private State currentState;
    private int count;

    public VendingMachine(int numberOfProducts) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        soldOutState = new SoldOutState(this);

        this.count = numberOfProducts;
        if (numberOfProducts > 0) {
            currentState = noCoinState;
        } else {
            currentState = soldOutState;
        }
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void releaseProduct() {
        System.out.println("Releasing product...");
        if (count > 0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
