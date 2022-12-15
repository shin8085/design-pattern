package factory.config;

/**
 * 扩展：简单工厂模式+配置文件
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }
}
