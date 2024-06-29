package design_patterns.behavioral.mediator;

import design_patterns.behavioral.mediator.airplane.Airplane;

public class AirportControlTowerMediator implements AirTrafficControlTowerMediator {
    @Override
    public void requestTakeoff(Airplane airplane) {
        // Logic for coordinating takeoff
        airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        // Logic for coordinating landing
        airplane.notifyAirTrafficControl("Requesting landing clearance.");
    }
}
