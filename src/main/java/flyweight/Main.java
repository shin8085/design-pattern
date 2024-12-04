package flyweight;

/**
 * 享元模式
 * 通过共享已存在的对象来减少需要创建的对象数量、避免大量相似对象的开销，从而提高系统资源利用率
 *  _
 * JDK中的享元模式 Integer.valueOf()
 *
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("yellow");

        AbstractBox box2 = BoxFactory.getInstance().getShape("I");
        box2.display("black");

        // ture
        System.out.println(box1 == box2);
    }
}
