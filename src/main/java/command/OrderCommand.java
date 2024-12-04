package command;

/**
 * 具体命令类
 * 
 * @author RJZ
 */
public class OrderCommand implements Command {

    /**
     * 厨师（接受者对象）
     */
    private final SeniorChef receiver;
    /**
     * 订单
     */
    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        Integer diningTable = order.getDiningTable();
        System.out.println(order.getDiningTable() + "桌下单");

        order.getFoodDir().forEach(receiver::makeFood);

        System.out.println(diningTable + "桌制作完成");
    }
}