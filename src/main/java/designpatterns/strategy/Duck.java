package designpatterns.strategy;

public class Duck {
    FlyiableBehaviour flyiableBehaviour = new NoFlyingBehaviour();
    EatingableBehaviour eatingableBehaviour = new NoEatingBehaviour();

    public Duck(FlyiableBehaviour flyiableBehaviour) {
        this.flyiableBehaviour = flyiableBehaviour;
    }

    public Duck(EatingableBehaviour eatingableBehaviour) {
        this.eatingableBehaviour = eatingableBehaviour;
    }

    public Duck(FlyiableBehaviour flyiableBehaviour, EatingableBehaviour eatingableBehaviour) {
        this.flyiableBehaviour = flyiableBehaviour;
        this.eatingableBehaviour = eatingableBehaviour;
    }

    public Duck() {
    }

    public String fly() {
        return flyiableBehaviour.fly();
    }

    public String eat() {
        return eatingableBehaviour.eat();
    }
}
