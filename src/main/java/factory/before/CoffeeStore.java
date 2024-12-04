package factory.before;

/**
 * @author RJZ
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        Coffee coffee = switch (type) {
            case "American" -> new AmericanCoffee();
            case "Latte" -> new LatteCoffee();
            default -> throw new RuntimeException(String.format("咖啡：%s不存在", type));
        };

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
