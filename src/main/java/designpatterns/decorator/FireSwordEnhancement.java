package designpatterns.decorator;

public class FireSwordEnhancement extends SwordEnchancement implements Weapon {
    public FireSwordEnhancement(Weapon sword) {
        super.weapon = sword;
    }

    @Override
    public String attack() {
        return "Fire_" + super.weapon.attack();
    }
}
