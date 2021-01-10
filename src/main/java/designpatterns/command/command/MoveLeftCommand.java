package designpatterns.command.command;

import designpatterns.command.soldier.Soldier;

public class MoveLeftCommand extends MoveCommand {
    private static final double X = -1;
    private static final double Y = 0;

    public MoveLeftCommand(Soldier soldier) {
        super(soldier, X, Y);
    }
}
