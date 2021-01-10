package designpatterns.command.soldier;

public interface Soldier {
    void shoot();

    void reload();

    void move(final double x, final double y);
}
