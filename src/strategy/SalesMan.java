package strategy;

/**
 * 环境角色（Context）
 * 
 * @author RJZ
 */
public class SalesMan {
    
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
