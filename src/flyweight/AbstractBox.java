package flyweight;

/**
 * 抽象享元角色
 *
 * @author RJZ
 */
public abstract class AbstractBox {

    /**
     * 获取图形
     * @return
     */
    public abstract String getShape();

    public void display(String color) {
        System.out.println("形状：" + getShape() + "，颜色：" + color);
    }
}
