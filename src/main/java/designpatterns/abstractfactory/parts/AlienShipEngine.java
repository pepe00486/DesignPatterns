package designpatterns.abstractfactory.parts;

public class AlienShipEngine implements ShipPart {
    private final String enginePower;

    public AlienShipEngine(String enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String getSpecification() {
        return "AlienShipEngine: " + enginePower;
    }
}
