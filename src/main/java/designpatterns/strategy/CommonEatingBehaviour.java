package designpatterns.strategy;

public class CommonEatingBehaviour implements EatingableBehaviour {
    @Override
    public String eat() {
        return "I am eating.";
    }
}
