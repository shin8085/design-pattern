package strategy;

/**
 * 策略模式
 * 优点：1、策略类间可以自由切换 2、扩展性良好 3、避免使用多重条件选择语句
 * 缺点：1、策略类会增多(可用享元模式优化) 2、所有策略类都需要对外暴露
 * _
 * JDK中的设计模式：Arrays.sort()
 * 
 * @author RJZ
 */
public class Main {
    
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
