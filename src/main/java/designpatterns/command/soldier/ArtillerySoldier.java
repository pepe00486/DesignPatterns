package designpatterns.command.soldier;

public class ArtillerySoldier extends ReguralSoldier {

    private static final double SPEED = 0.5;
    private static final int SHOT_COST = 1;
    private static final String SHOT_SOUND = "BOOOOOOM !!!";

    public ArtillerySoldier(int ammunition, double positionX, double positionY) {
        super(ammunition, positionX, positionY, SPEED, SHOT_SOUND, SHOT_COST);

    }

    @Override
    public String toString() {
        return "ArtillerySoldier{" +
                "ammunition=" + super.ammunition +
                ", positionX=" + super.positionX +
                ", positionY=" + super.positionY +
                '}';
    }
}
