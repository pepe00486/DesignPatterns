package designpatterns.command.command;

import designpatterns.command.soldier.Soldier;

public class MoveRightCommand extends MoveCommand {
    private static final double X = 1;
    private static final double Y = 0;

    public MoveRightCommand(Soldier soldier) {
        super(soldier, X, Y);
    }
}
