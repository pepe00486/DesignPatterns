package designpatterns.strategy;

public class WildEatingBehaviour implements EatingableBehaviour {
    @Override
    public String eat() {
        return "I am eating like wild.";
    }
}
