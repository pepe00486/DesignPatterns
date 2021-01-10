package designpatterns.command.command;

import designpatterns.command.soldier.Soldier;

public class MoveCommand implements SoldierCommand {
    private final Soldier soldier;
    private final double x, y;

    public MoveCommand(Soldier soldier, double x, double y) {
        this.soldier = soldier;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        soldier.move(x, y);
    }

    @Override
    public void undo() {
        soldier.move(-x, -y);

    }
}
