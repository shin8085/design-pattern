package proxy.static_proxy;

/**
 * 火车站类
 *
 * @author RJZ
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
