package proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂，获取代理对象
 *
 * @author RJZ
 */
public class ProxyFactory implements MethodInterceptor {

    private final TrainStation trainStation = new TrainStation();

    /**
     * 获取代理类（继承于TrainStation）
     */
    public TrainStation getProxyObject(){
        // 创建Enhancer对象，类似与JDk代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    /**
     * 调用代理对象方法时，实际执行的方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行了");
        return methodProxy.invoke(trainStation, objects);
    }
}
