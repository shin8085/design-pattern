package singleton;

/**
 * @author RJZ
 */
public class Singleton06 {
    public static void main(String[] args) {

    }

    /**
     * 静态内部类
     * JVM在加载外部类时，不会加载静态内部类，只有内部类的属性/方法被调用时才加载，并初始化其静态属性
     * 实现了懒加载且保证线程安全，效率较高
     */
    static class Singleton{
        private Singleton(){}

        /**
         * 调用getInstance时才进行装载
         */
        private static class SingletonInstance{
            private static final Singleton instance = new Singleton();
        }

        private static Singleton getInstance(){
            return SingletonInstance.instance;
        }
    }
}
