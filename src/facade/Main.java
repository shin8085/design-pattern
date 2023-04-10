package facade;

/**
 * 外观模式
 *
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}
