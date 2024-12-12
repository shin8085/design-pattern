package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 *
 * @author RJZ
 */
public class SubscriptionSubject implements Subject {

    /**
     * 观察者列表
     */
    private List<ObServer> observers = new ArrayList<>();

    @Override
    public void attach(ObServer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ObServer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        observers.forEach(observer -> observer.update(message));
    }
    
}
