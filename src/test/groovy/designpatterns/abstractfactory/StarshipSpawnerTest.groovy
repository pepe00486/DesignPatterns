package designpatterns.abstractfactory

import designpatterns.abstractfactory.client.StarshipSpawner
import spock.lang.Specification

class StarshipSpawnerTest extends Specification {
    def "SpawnAvailableStarships"() {
        given: 'Spawner is created'
            StarshipSpawner starshipSpawner = new StarshipSpawner()

        when: 'spawnAvailableStarships is called'
            def result = starshipSpawner.spawnAvailableStarships()

        then: 'it returns list of specs for each ship created'
            result == "Spawning Irish Army Starship \n" +
                    "IrishArmyShipBody: TriColour\n" +
                    "IrishArmyShipEngine: 100000 hp\n" +
                    "IrishArmyShipWeapon: GreenLaser\n" +
                    "Spawning Aliens Starship \n" +
                    "AlienShipBody: DarkAsBlackHole\n" +
                    "AlienShipEngine: 2000000 HP\n" +
                    "AlienShipWeapon: AlienLaser"

        and: 'allien ship instantiated'
            starshipSpawner.getAlienStarShip() != null

        and: 'Irish army ship is instantiated'
            starshipSpawner.getIrishArmyStarShip() != null
    }
}
