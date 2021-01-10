package designpatterns.command.command;

import designpatterns.command.soldier.Soldier;

public class MoveBackwardCommand extends MoveCommand {
    private static final double X = 0;
    private static final double Y = -1;

    public MoveBackwardCommand(Soldier soldier) {
        super(soldier, X, Y);
    }
}
