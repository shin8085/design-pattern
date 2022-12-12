package singleton;

/**
 * @author RJZ
 */
public class Singleton07 {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());
    }

    /**
     * 枚举
     * 避免多线程同步问题；防止反序列化创建新的对象
     */
    enum Singleton{
        INSTANCE;
    }
}
