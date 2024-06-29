package design_patterns.behavioral.mediator.airplane;

import design_patterns.behavioral.mediator.AirTrafficControlTowerMediator;

public class CommercialAirplane implements Airplane {
    private AirTrafficControlTowerMediator mediator;

    public CommercialAirplane(AirTrafficControlTowerMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void requestTakeoff() {
        mediator.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Commercial Airplane: " + message);
    }
}
