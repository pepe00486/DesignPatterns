package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.parts.IrishArmyShipBody;
import designpatterns.abstractfactory.parts.IrishArmyShipEngine;
import designpatterns.abstractfactory.parts.IrishArmyShipWeapon;
import designpatterns.abstractfactory.parts.ShipPart;

public class IrishArmyShipFactory implements StarShipFactory {
    @Override
    public ShipPart createWeapon() {
        return new IrishArmyShipWeapon("GreenLaser");
    }

    @Override
    public ShipPart createBody() {
        return new IrishArmyShipBody("TriColour");
    }

    @Override
    public ShipPart createEngine() {
        return new IrishArmyShipEngine("100000 hp");
    }
}
