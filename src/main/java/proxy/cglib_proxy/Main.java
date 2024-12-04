package proxy.cglib_proxy;

/**
 * CGLIB动态代理
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
    }
}
