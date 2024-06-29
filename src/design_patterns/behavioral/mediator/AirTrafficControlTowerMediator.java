package design_patterns.behavioral.mediator;

import design_patterns.behavioral.mediator.airplane.Airplane;

public interface AirTrafficControlTowerMediator {
    void requestTakeoff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
