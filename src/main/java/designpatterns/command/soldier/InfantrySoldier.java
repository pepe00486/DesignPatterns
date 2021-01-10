package designpatterns.command.soldier;

public class InfantrySoldier extends ReguralSoldier {
    public static final String SHOT_SOUND = "Pifff-Paff !!! RATTATATA !!";
    public static final int SHOT_COST = 3;
    public static final double SPEED = 1;

    public InfantrySoldier(int ammunition, double positionX, double positionY) {
        super(ammunition, positionX, positionY, SPEED, SHOT_SOUND, SHOT_COST);
    }

    @Override
    public String toString() {
        return "InfantrySoldier{" +
                "ammunition=" + ammunition +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
