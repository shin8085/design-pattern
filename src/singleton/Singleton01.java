package singleton;

/**
 * @author RJZ
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }

    /**
     * 饿汉式（静态变量）
     * 优点：写法简单；避免了线程同步问题
     * 缺点：类装载的时候就完成了实例化，如果从始至终未使用这个实例会导致内存浪费
     */
    static class Singleton{

        private static final Singleton INSTANCE = new Singleton();

        private Singleton() {
        }

        public static Singleton getInstance(){
            return INSTANCE;
        }
    }
}
