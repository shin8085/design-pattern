package singleton;

/**
 * @author RJZ
 */
public class Singleton05 {
    public static void main(String[] args) {

    }

    /**
     * 懒汉式（双重检查）
     * 实现了懒加载且保证线程安全，效率较高
     */
    static class Singleton {

        // volatile把修改的内容立即刷新到缓存
        private static volatile Singleton instance;

        private Singleton(){}

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
