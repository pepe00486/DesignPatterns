package designpatterns.decorator;

public class FrostSwordEnhancement extends SwordEnchancement {
    public FrostSwordEnhancement(Weapon sword) {
        super.weapon = sword;
    }

    @Override
    public String attack() {
        return "Frost_" + super.weapon.attack();
    }
}
