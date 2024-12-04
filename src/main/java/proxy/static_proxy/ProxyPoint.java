package proxy.static_proxy;

/**
 * 代售点类
 *
 * @author RJZ
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取了一些代售费用");
        trainStation.sell();
    }
}
