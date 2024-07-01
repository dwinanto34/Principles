package design_patterns.behavioral.state.vending_machine_state;

public interface State {
    void insertCoin();
    void ejectCoin();
    void selectProduct();
    void dispense();
}
