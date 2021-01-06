package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.parts.AlienShipBody;
import designpatterns.abstractfactory.parts.AlienShipEngine;
import designpatterns.abstractfactory.parts.AlienShipWeapon;
import designpatterns.abstractfactory.parts.ShipPart;

public class AlienShipFactory implements StarShipFactory {

    @Override
    public ShipPart createWeapon() {
        return new AlienShipWeapon("AlienLaser");
    }

    @Override
    public ShipPart createBody() {
        return new AlienShipBody("DarkAsBlackHole");
    }

    @Override
    public ShipPart createEngine() {
        return new AlienShipEngine("2000000 HP");
    }
}
