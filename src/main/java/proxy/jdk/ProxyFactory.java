package proxy.jdk;

import proxy.static_proxy.SellTickets;
import proxy.static_proxy.TrainStation;

import java.lang.reflect.Proxy;

/**
 * 代理工厂，用来创建代理对象
 *
 * @author RJZ
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject(){

        /*
          ClassLoader loader: 类加载器，用于加载代理类
          Class<?>[] interfaces: 代理类实现的接口的字节码对象
          InvocationHandler h: 代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                /*
                   proxy: 代理对象，和返回的对象是同一个对象
                   method: 代理的方法（即sell方法）
                   args: 代理的方法的参数(sell方法没有参数，所以这里没用)

                   return； 代理方法的返回值（sell方法没有返回值）
                 */
                (proxy, method, args) -> {
                    System.out.println("111");
                    return method.invoke(trainStation, args);
                });
    }
}
