package designpatterns.decorator;

public class FireSwordEnchancement implements SwordEnchancement{
    private SwordEnchancement sword;

    public FireSwordEnchancement(SwordEnchancement sword) {
        this.sword = sword;
    }

    @Override
    public String attack() {
        return "Fire_" + sword.attack();
    }
}
