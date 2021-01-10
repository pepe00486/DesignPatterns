package designpatterns.command.controller;

import designpatterns.command.command.*;
import designpatterns.command.soldier.Soldier;

import java.util.ArrayList;
import java.util.List;

public class SoldierController {
    private final List<SoldierCommand> commandsExecuted;
    private final Soldier soldier;

    public SoldierController(Soldier soldier) {
        commandsExecuted = new ArrayList<>();
        this.soldier = soldier;
    }

    public void moveForward() {
        execute(new MoveForwardCommand(soldier));
    }

    public void moveBackward() {
        execute(new MoveBackwardCommand(soldier));
    }

    public void moveLeft() {
        execute(new MoveLeftCommand(soldier));
    }

    public void moveRight() {
        execute(new MoveRightCommand(soldier));
    }

    public void revertCommands(int numberOfCommands) {
        for (int i = 0; i < numberOfCommands; i++)
            commandsExecuted.remove(commandsExecuted.size() - 1).undo();
    }

    private void execute(SoldierCommand command) {
        command.execute();
        commandsExecuted.add(command);
    }
}
