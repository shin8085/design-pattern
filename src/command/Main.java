package command;

/**
 * 命令模式
 * 优点：将调用者和接收者解耦；增加或删除命令非常方便；可以实现宏命令；方便实现 Undo 和 Redo 操作。
 * 缺点：可能导致过多的具体命令类；使系统变得复杂。
 * JDK中的应用：Runnable命令角色，Thread调用者，start为执行方法
 * 
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        
        // 创建订单
        Order order = new Order();
        order.setDiningTable(1);
        order.addFood("鱼香肉丝", 1);
        order.addFood("宫保鸡丁", 2);

        // 创建命令
        Command command = new OrderCommand(new SeniorChef(), order);
        
        // 创建调用者
        Waitor waitor = new Waitor();
        waitor.addCommand(command);

        // 发起命令
        waitor.orderUp(); 
    }
}
