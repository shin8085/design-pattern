package strategy;

/**
 * 具体策略类
 * 
 * @author RJZ
 */
public class StrategyA implements Strategy {
    
    @Override
    public void show() {
        System.out.println("StrategyA");
    }
}
