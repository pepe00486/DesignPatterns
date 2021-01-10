package designpatterns.command.soldier;

public class IntelligenceSoldier extends ReguralSoldier {
    public static final String SHOT_SOUND = "Pifff....";
    public static final int SHOT_COST = 1;
    public static final double SPEED = 2;

    public IntelligenceSoldier(int ammunition, double positionX, double positionY) {
        super(ammunition, positionX, positionY, SPEED, SHOT_SOUND, SHOT_COST);
    }

    @Override
    public String toString() {
        return "IntelligenceSoldier{" +
                "ammunition=" + ammunition +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
