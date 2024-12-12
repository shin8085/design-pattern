package observer;

/**
 * 观察者模式
 * 优点：1、降低耦合度。 2、观察者模式支持广播通信。
 * 缺点：1、如果观察者非常多，会比较耗时。2、如果被观察者有循环依赖的话，观察者会触发它们之间进行循环调用，可能导致系统崩溃。
 * Jdk中已经实现了观察者模式，就是java.util.Observable类和java.util.Observer接口。
 *
 * @author RJZ
 */
public class Main {
    
    public static void main(String[] args) {
        Subject subject = new SubscriptionSubject();

        subject.attach(new WeixinUser("小明"));
        subject.attach(new WeixinUser("小红"));

        subject.notify("今天天气真好");
    }
}
