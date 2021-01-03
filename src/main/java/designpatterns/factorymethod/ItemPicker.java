package designpatterns.factorymethod;

public class ItemPicker {
    public EqItem pickItem(final String type) {
        return switch (type) {
            case "Food" -> new Food();
            case "Sword" -> new Sword();
            default -> null;
        };
    }
}
