package designpatterns.decorator

import spock.lang.Specification

class SwordTest extends Specification {
    def 'Should print attack message'() {
        when:
            Sword sword = new Sword('Attack')

        then: 'should print attack message'
            sword.attack() == 'Attack'

        when:
            sword = new Sword('Fire Attack')

        then: 'should print "Fire Attack" message'
            sword.attack() == 'Fire Attack'
    }
}
