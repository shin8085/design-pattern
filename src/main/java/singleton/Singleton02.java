package singleton;

/**
 * @author RJZ
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }

    /**
     * 饿汉式（静态代码块）
     * 优缺点与 {@link Singleton01} 相同
     */
    static class Singleton{

        private static final Singleton INSTANCE;

        static {
            INSTANCE = new Singleton();
        }

        private Singleton() {
        }

        public static Singleton getInstance(){
            return INSTANCE;
        }
    }
}
