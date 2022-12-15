package factory.simple;

/**
 * @author RJZ
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){

        return SimpleCoffeeFactory.createCoffee(type);
    }
}
