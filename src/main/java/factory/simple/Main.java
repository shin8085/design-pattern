package factory.simple;

/**
 * 简单工厂模式
 * 不属于23中设计模式
 * 缺点：增加新产品时依然需要修改工厂类的代码，违背了“开闭原则”
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("American");
        System.out.println(coffee.getName());
    }
}
