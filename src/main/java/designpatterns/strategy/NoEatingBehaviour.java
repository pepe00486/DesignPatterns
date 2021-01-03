package designpatterns.strategy;

public class NoEatingBehaviour implements EatingableBehaviour {
    @Override
    public String eat() {
        return null;
    }
}
