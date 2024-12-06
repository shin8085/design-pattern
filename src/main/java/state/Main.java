package state;

/**
 * 状态模式
 * 优点：结构清晰，状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”
 * 缺点：1、状态模式的使用必然会增加系统的类与对象的个数。
 *       2。状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。
 *       3。状态模式对开闭原则的支持并不太好
 * 
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new RunningState());

        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();
        context.run();
    }
}
