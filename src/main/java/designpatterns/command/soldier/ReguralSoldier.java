package designpatterns.command.soldier;

public class ReguralSoldier implements Soldier {
    private final double speed;
    private final int shotCost;
    private final String shotSound;
    private final int initAmmunition;
    int ammunition;
    double positionX;
    double positionY;
    private int emptyShootCount;

    public ReguralSoldier(int ammunition, double positionX, double positionY, double speed, String shotSound, int shotCost) {
        this.ammunition = ammunition;
        this.positionX = positionX;
        this.positionY = positionY;
        this.shotSound = shotSound;
        this.shotCost = shotCost;
        this.speed = speed;
        initAmmunition = ammunition;
    }

    @Override
    public void shoot() {
        if (ammunition > 0) {
            ammunition -= shotCost;
            System.out.println(shotSound);
        } else emptyShootCount++;
    }

    @Override
    public void reload() {
        if (emptyShootCount > 0)
            emptyShootCount--;
        else if (ammunition != initAmmunition)
            ammunition += shotCost;
    }

    @Override
    public void move(double x, double y) {
        positionX += x * speed;
        positionY += y * speed;
    }
}
