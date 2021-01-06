package designpatterns.abstractfactory.parts;

public class AlienShipWeapon implements ShipPart {
    private final String weaponType;

    public AlienShipWeapon(final String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String getSpecification() {
        return "AlienShipWeapon: " + weaponType;
    }
}
