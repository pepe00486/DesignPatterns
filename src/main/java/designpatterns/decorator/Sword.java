package designpatterns.decorator;

public class Sword implements SwordEnchancement {
    private final String message;

    public Sword(final String message) {
        this.message = message;
    }

    @Override
    public String attack() {
        return message;
    }
}
