package command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 * 
 * @author RJZ
 */
public class Order {
    
    /**
     * 餐桌号
     */
    private Integer diningTable;

    /**
     * 下单的食物和份数
     */
    private final Map<String, Integer> foodDir = new HashMap<>();

    public Integer getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(Integer diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void addFood(String name, int num) {
        foodDir.put(name, num);
    }
}
