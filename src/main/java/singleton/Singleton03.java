package singleton;

/**
 * @author RJZ
 */
public class Singleton03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }

    /**
     * 懒汉式（线程不安全）
     * 优点：起到了懒加载的效果
     * 缺点，存在线程安全问题，多线程调用时可能会产生多个实例
     */
    static class Singleton{

        private static Singleton instance;

        private Singleton(){}

        public static Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }
}
