package designpatterns.abstractfactory.client;

import designpatterns.abstractfactory.factories.AlienShipFactory;
import designpatterns.abstractfactory.factories.IrishArmyShipFactory;
import designpatterns.abstractfactory.factories.StarShipFactory;

public class StarshipSpawner {
    private StarShip irishArmyStarShip;
    private StarShip alienStarShip;

    public String spawnAvailableStarships() {
        irishArmyStarShip = getStarShip(new IrishArmyShipFactory());
        alienStarShip = getStarShip(new AlienShipFactory());
        return "Spawning Irish Army Starship " + "\n" + irishArmyStarShip.callOutSpecs()
                + "\n" + "Spawning Aliens Starship " + "\n" + alienStarShip.callOutSpecs();

    }

    public StarShip getIrishArmyStarShip() {
        return irishArmyStarShip;
    }

    public StarShip getAlienStarShip() {
        return alienStarShip;
    }

    private static PrettyStarShip getStarShip(final StarShipFactory starShipFactory) {
        return new PrettyStarShip(starShipFactory.createWeapon(),
                starShipFactory.createEngine(),
                starShipFactory.createBody());
    }

}
