package singleton;

/**
 * 懒汉式（线程安全）
 * 优点：实现了懒加载且线程安全
 * 缺点：效率较低
 * @author RJZ
 */
public class Singleton04 {
    public static void main(String[] args) {

    }

    static class Singleton{

        private static Singleton instance;

        private Singleton(){}

        public static synchronized Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }
}
