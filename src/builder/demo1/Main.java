package builder.demo1;

/**
 * 建造者模式
 * 指挥者类（Directer）控制构造顺序，并返回完整的产品；
 * 有些情况下需要简化系统时，也可以把指挥者类和抽象建造者类结合
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        Directer directer = new Directer(new OfoBuilder());
        Bike bike = directer.buildBike();
        System.out.println(bike);
    }
}
