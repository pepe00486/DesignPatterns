package designpatterns.decorator;

public class Sword implements Weapon {
    private final String message;

    public Sword(final String message) {
        this.message = message;
    }

    @Override
    public String attack() {
        return message;
    }
}
