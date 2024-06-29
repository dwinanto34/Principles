package design_patterns.behavioral.mediator.airplane;

public interface Airplane {
    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
