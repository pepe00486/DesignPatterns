package designpatterns.strategy;

public class CommonFlyingBehaviour implements FlyiableBehaviour {
    @Override
    public String fly() {
        return "I am flying";
    }
}
