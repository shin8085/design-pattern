package factory.method;

/**
 * 工厂方法模式
 * 缺点：每增加一种产品，都要增加一个产品类和对应的工厂实现类，增加了系统复杂度
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(factory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
