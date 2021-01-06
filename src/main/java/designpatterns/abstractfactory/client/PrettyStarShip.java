package designpatterns.abstractfactory.client;

import designpatterns.abstractfactory.parts.ShipPart;

public class PrettyStarShip implements StarShip {
    private final ShipPart weapon;
    private final ShipPart engine;
    private final ShipPart body;

    public PrettyStarShip(ShipPart weapon, ShipPart engine, ShipPart body) {
        this.weapon = weapon;
        this.engine = engine;
        this.body = body;
    }


    @Override
    public String callOutSpecs() {
        return body.getSpecification() +
                "\n" +
                engine.getSpecification() +
                "\n" +
                weapon.getSpecification();

    }
}
