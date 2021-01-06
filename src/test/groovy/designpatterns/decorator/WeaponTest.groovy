package designpatterns.decorator

import spock.lang.Specification

class WeaponTest extends Specification {
    def 'Should be able to attack'() {
        given:
        def SWORD_ATTACK = 'Attack_1'
        Sword sword = new Sword(SWORD_ATTACK)

        when: 'Fire enchancement is added'
        Weapon fireSwordEnchancement = new FireSwordEnhancement(sword)

        then: 'should append Fire to attack'
        fireSwordEnchancement.attack() == 'Fire_' + SWORD_ATTACK

        when: 'Frost enchancement is added to sword'
        Weapon frostFireSwordEnchancement = new FrostSwordEnhancement(fireSwordEnchancement)

        then: 'should append Frost to attack'
        frostFireSwordEnchancement.attack() == 'Frost_Fire_' + SWORD_ATTACK
    }

    def 'Should be able to attack with 2 Fire and 1 Frost'() {
        given:
        def SWORD_ATTACK = 'Attack_1'
        Weapon sword = new FireSwordEnhancement(
                                        new FireSwordEnhancement(
                                                new FrostSwordEnhancement(
                                                        new Sword(SWORD_ATTACK))))

        expect: 'sword to attack with Fire_Fire_Frost_Attack_1'
        sword.attack() == 'Fire_Fire_Frost_Attack_1'

    }
}
