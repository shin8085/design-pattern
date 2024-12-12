package observer;

/**
 * 
 *
 * @author RJZ
 */
public class WeixinUser implements ObServer {

    private final String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到推送消息：" + message);
    }
    
}
