package designpatterns.abstractfactory.parts;

public class IrishArmyShipEngine implements ShipPart {
    private final String enginePower;

    public IrishArmyShipEngine(final String enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String getSpecification() {
        return "IrishArmyShipEngine: " + enginePower;
    }
}
