package designpatterns.abstractfactory.parts;

public class IrishArmyShipWeapon implements ShipPart {
    private final String weaponType;

    public IrishArmyShipWeapon(final String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String getSpecification() {
        return "IrishArmyShipWeapon: " + weaponType;
    }
}
