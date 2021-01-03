package designpatterns.strategy;

public class BossLikeFlyingBehaviour implements FlyiableBehaviour {
    @Override
    public String fly() {
        return "I am flying like a boss.";
    }
}
