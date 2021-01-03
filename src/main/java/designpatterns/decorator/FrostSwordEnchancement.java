package designpatterns.decorator;

public class FrostSwordEnchancement implements SwordEnchancement {
    private SwordEnchancement sword;

    public FrostSwordEnchancement(SwordEnchancement sword) {
        this.sword = sword;
    }

    @Override
    public String attack(){
        return "Frost_" + sword.attack();
    }
}
