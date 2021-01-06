package designpatterns.abstractfactory.parts;

public class IrishArmyShipBody implements ShipPart {
    private final String bodyColour;

    public IrishArmyShipBody(final String bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public String getSpecification() {
        return "IrishArmyShipBody: " + bodyColour;
    }
}
