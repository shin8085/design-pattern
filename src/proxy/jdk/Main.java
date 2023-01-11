package proxy.jdk;

import proxy.static_proxy.SellTickets;

/**
 * JDK动态代理
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
