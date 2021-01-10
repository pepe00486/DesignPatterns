package designpatterns.command.controller

import designpatterns.command.command.SoldierCommand
import designpatterns.command.soldier.ArtillerySoldier
import designpatterns.command.soldier.InfantrySoldier
import designpatterns.command.soldier.IntelligenceSoldier
import designpatterns.command.soldier.Soldier
import spock.lang.Specification

class SoldierControllerTest extends Specification {
    def 'Test Movement of the soldier'() {
        given: 'Artillery Soldeir exists'
            ArtillerySoldier soldier = new ArtillerySoldier(10, 0, 0)
        and: 'Controller exist'
            SoldierController controller = new SoldierController(soldier)
        expect: 'SoldierController has list of commands'
            controller.commandsExecuted instanceof List<SoldierCommand>
        when:
            controller.moveForward()
        then:
            soldier.positionY == 0.5

        when:
            controller.moveBackward()
        then:
            soldier.positionY == 0

        when:
            controller.moveLeft()
        then:
            soldier.positionX == -0.5

        when:
            controller.moveRight()
        then:
            soldier.positionX == 0

        when: 'Series of steps is invoked'
            controller.moveBackward()
            controller.moveBackward()
            controller.moveBackward()
            controller.moveLeft()
            controller.moveLeft()
            controller.moveLeft()
        then:
            soldier.positionX == -1.5
            soldier.positionY == -1.5
    }

    def 'Test command reverse'(Soldier soldier) {
        given: 'Controller exist'
            SoldierController controller = new SoldierController(soldier)
        and: 'Series of steps is invoked'
            controller.moveBackward()
            controller.moveBackward()
            controller.moveBackward()
            controller.moveLeft()
            controller.moveLeft()
            controller.moveLeft()
        expect: 'soldier has initial position ${initialX}, ${initialY}'
            soldier.positionX == initialX
            soldier.positionY == initialY

        when: 'reverse is invoked with 3 steps'
            controller.revertCommands(numberOfSteps)
        then: 'Position of soldier is y = -3 , x = 0'
            soldier.positionX == expectedX
            soldier.positionY == expectedY

        where:
            soldier                           | numberOfSteps || initialX | initialY | expectedX | expectedY
            new InfantrySoldier(10, 0, 0)     | 3             || -3       | -3       | 0         | -3
            new ArtillerySoldier(10, 10, 5)   | 1             || 8.5      | 3.5      | 9.0       | 3.5
            new IntelligenceSoldier(10, 0, 0) | 6             || -6       | -6       | 0         | 0
    }


}
