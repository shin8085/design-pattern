package singleton;

import java.io.*;

/**
 * 通过反序列化的方式破坏单例模式
 * 解决方式：增加{@link Singleton#readResolve()}方法并返回实例
 *
 * @author RJZ
 */
public class BrokenByDeserialization {

    private static final String FILE_PATH = "D:\\files\\Documents\\object.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        writeSingletonToFile(instance);

        Singleton instance2 = readSingletonFromFile();
        Singleton instance3 = readSingletonFromFile();

        // 加readResolve方法前
        System.out.println(instance == instance2); // false
        System.out.println(instance2 == instance3); // false

        // 加readResolve方法后
//        System.out.println(instance == instance2); // true
//        System.out.println(instance2 == instance3); // true
    }

    public static Singleton readSingletonFromFile() throws IOException, ClassNotFoundException {

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            return  (Singleton)inputStream.readObject();
        }
    }


    public static void writeSingletonToFile(Singleton instance) throws IOException {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(instance);
        }

    }

    static class Singleton implements Serializable { // 实现Serializable接口用于后面测试通过序列化破环单例

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

        /**
         * 解决反序列化破坏单例模式
         * 当进行反序列化时，会自动调用该方法，获取该方法返回的对象
         * 若不存在该方法，反序列化时则会生成新对象
         * @see ObjectInputStream#readObject()
//         * @see ObjectInputStream#readObject0(Class, boolean)
//         * @see ObjectInputStream#readOrdinaryObject(boolean) 2249
         */
        @Serial
        public Object readResolve(){
            return getInstance();
        }
    }
}
