package designpatterns.command.soldier

import spock.lang.Specification

class InfantrySoldierTest extends Specification {
    def 'Test Movement'() {
        given: 'Soldier is created at 0,0'
            InfantrySoldier artillerySoldier = new InfantrySoldier(0, 0, 0)
        when: 'Moved by 0, 1'
            artillerySoldier.move(x, y)
        then: 'poistion x = 0'
            artillerySoldier.positionX == xResult
        and: 'position y = 0.5'
            artillerySoldier.positionY == yResult
        where:
            x    | y   || xResult | yResult
            0    | 1   || 0       | 1
            0    | -1  || 0       | -1
            1    | 0   || 1       | 0
            -1   | 0   || -1      | 0
            -1.5 | 1.5 || -1.5    | 1.5
    }

    def 'Test Shooting'() {
        given: 'Soldier is created with 10 ammo'
            InfantrySoldier infantrySoldier = new InfantrySoldier(6, 0, 0)
        when: 'Soldier shoots'
            infantrySoldier.shoot()
        then: 'Ammunition is reduced by 3'
            infantrySoldier.ammunition == 3

        when: 'Soldier shoots'
            infantrySoldier.shoot()
        then: 'Ammunition is reduced by 3'
            infantrySoldier.ammunition == 0

        when: 'Soldier shoots'
            infantrySoldier.shoot()
        then: 'Ammunition remains at 0'
            infantrySoldier.ammunition == 0

        when: 'Soldier reloads'
            infantrySoldier.reload()
        then: 'Ammunition remains at 0'
            infantrySoldier.ammunition == 0

        when: 'Soldier reloads'
            infantrySoldier.reload()
        then: 'Ammunition is 3'
            infantrySoldier.ammunition == 3

        when: 'Soldier reloads'
            infantrySoldier.reload()
        then: 'Ammunition is 6'
            infantrySoldier.ammunition == 6

        when: 'Soldier reloads'
            infantrySoldier.reload()
        then: 'Ammunition remains at 6'
            infantrySoldier.ammunition == 6
    }
}
