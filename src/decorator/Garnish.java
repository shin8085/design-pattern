package decorator;

/**
 * 装饰着类（抽象装饰角色）
 *
 * @author RJZ
 */
public abstract class Garnish extends FastFood {

    // 声明快餐类对象
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
