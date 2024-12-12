package observer;

/**
 * 抽象主题角色类
 *
 * @author RJZ
 */
public interface Subject {
    
    /**
     * 增加观察者对象
     * 
     * @param observer 观察者对象
     */
    public void attach(ObServer observer);

    /**
     * 观察者对象
     * 
     * @param observer 观察者对象
     */
    public void detach(ObServer observer);

    /**
     * 通知观察者
     * 
     * @param message 通知消息
     */
    public void notify(String message);
}
