package designpatterns.command.soldier

import spock.lang.Specification

class IntelligenceSoldierTest extends Specification {
    def 'Test Movement'() {
        given: 'Soldier is created at 0,0'
            IntelligenceSoldier artillerySoldier = new IntelligenceSoldier(0, 0, 0)
        when: 'Moved by 0, 1'
            artillerySoldier.move(x, y)
        then: 'poistion x = 0'
            artillerySoldier.positionX == xResult
        and: 'position y = 0.5'
            artillerySoldier.positionY == yResult
        where:
            x    | y   || xResult | yResult
            0    | 1   || 0       | 2
            0    | -1  || 0       | -2
            1    | 0   || 2       | 0
            -1   | 0   || -2      | 0
            -1.5 | 1.5 || -3      | 3
    }

    def 'Test Shooting'() {
        given: 'Soldier is created with 10 ammo'
            IntelligenceSoldier intelligenceSoldier = new IntelligenceSoldier(2, 0, 0)
        when: 'Soldier shoots'
            intelligenceSoldier.shoot()
        then: 'Ammunition is reduced by 3'
            intelligenceSoldier.ammunition == 1

        when: 'Soldier shoots'
            intelligenceSoldier.shoot()
        then: 'Ammunition is reduced by 3'
            intelligenceSoldier.ammunition == 0

        when: 'Soldier shoots'
            intelligenceSoldier.shoot()
        then: 'Ammunition remains at 0'
            intelligenceSoldier.ammunition == 0

        when: 'Soldier reloads'
            intelligenceSoldier.reload()
        then: 'Ammunition remains at 0'
            intelligenceSoldier.ammunition == 0

        when: 'Soldier reloads'
            intelligenceSoldier.reload()
        then: 'Ammunition is 3'
            intelligenceSoldier.ammunition == 1

        when: 'Soldier reloads'
            intelligenceSoldier.reload()
        then: 'Ammunition is 6'
            intelligenceSoldier.ammunition == 2

        when: 'Soldier reloads'
            intelligenceSoldier.reload()
        then: 'Ammunition remains at 6'
            intelligenceSoldier.ammunition == 2
    }
}
