package facade;

/**
 * 智能音响
 * 外观类，用户主要和该对象进行交互
 *
 * @author RJZ
 */
public class SmartAppliancesFacade {

    private final Light light = new Light();
    private final TV tv = new TV();
    private final AirCondition airCondition = new AirCondition();

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }else {
            System.out.println("听不懂呢");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();;
        tv.off();;
        airCondition.off();
    }


}
