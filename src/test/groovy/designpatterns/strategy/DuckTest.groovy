package designpatterns.strategy

import spock.lang.Specification

class DuckTest extends Specification {
    def 'Duck exists'() {
        given:
        Duck duck = new Duck()

        expect:
        assert duck != null
    }

    def 'Duck should fly'() {
        given: 'Duck exists'
        Duck duck = new Duck(new CommonFlyingBehaviour())

        expect: 'Duck prints "I am flying" when called'
        duck.fly() == "I am flying"
    }

    def 'Duck should fly like a boss'(){
        given: 'Duck exists'
        Duck duck= new Duck(new BossLikeFlyingBehaviour())

        expect: 'Duck prints "Flying like a boss"'
        duck.fly() == 'I am flying like a boss.'
    }

    def 'Duck should eat'() {
        given: 'Duck exists'
        Duck duck = new Duck(new CommonEatingBehaviour())

        expect: 'Duck prints "I am eating" when called'
        duck.eat() == "I am eating."
    }

    def 'Duck should eat like wild'(){
        given: 'Duck exists'
        Duck duck= new Duck(new WildEatingBehaviour())

        expect: 'Duck prints "I am eating like wild."'
        duck.eat() == 'I am eating like wild.'
    }

    def 'Duck should fly like a boss and eat like common'(){
        given: 'Duck exists'
        Duck duck = new Duck(new BossLikeFlyingBehaviour(), new CommonEatingBehaviour())

        expect: 'duck to fly like a bosss'
        duck.fly() == 'I am flying like a boss.'

        and: 'eat like common'
        duck.eat() == 'I am eating.'
    }
}