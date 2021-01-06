package designpatterns.abstractfactory.parts;

public class AlienShipBody implements ShipPart {
    private final String bodyColour;

    public AlienShipBody(final String bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public String getSpecification() {
        return "AlienShipBody: " + bodyColour;
    }
}
