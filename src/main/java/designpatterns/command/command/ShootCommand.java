package designpatterns.command.command;

import designpatterns.command.soldier.Soldier;

public class ShootCommand implements SoldierCommand {
    private final Soldier soldier;

    public ShootCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.shoot();
    }

    @Override
    public void undo() {
        soldier.reload();
    }
}
