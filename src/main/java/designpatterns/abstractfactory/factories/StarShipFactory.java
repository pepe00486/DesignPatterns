package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.parts.ShipPart;

public interface StarShipFactory {
    ShipPart createWeapon();

    ShipPart createBody();

    ShipPart createEngine();
}
