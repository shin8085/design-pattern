package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射的方式破环单例模式
 * 解决方法：限制构造方法使用次数
 *
 * @author RJZ
 */
public class BrokenByReflection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance = Singleton.getInstance();

        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton instance1 = constructor.newInstance(); // 构造方法增加限制后将报错
        Singleton instance2 = constructor.newInstance();

        System.out.println(instance == instance1); // false
        System.out.println(instance1 == instance2); // false

    }

    static class Singleton {

        // volatile把修改的内容立即刷新到缓存
        private static volatile Singleton instance;
        private static boolean flag = false;

        private Singleton(){

            // 解决反射破坏单例模式
            synchronized (Singleton.class){
                if (flag){
                    // flag 为true说明该类已经实例化过了，直接抛出异常不允许再次实例化
                    throw new RuntimeException();
                }
                flag = true;
            }
        }

        public static Singleton getInstance(){
            if (instance == null){
                synchronized (Singleton.class) {
                    if (instance == null){
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
