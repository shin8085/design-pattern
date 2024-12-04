package template;

/**
 * 模板方法模式
 * 优点：1、提高代码复用性；2、实现了反向控制
 * 缺点：1、使系统中类的个数增加，设计更加抽象；2、提高了代码阅读难度
 * 使用场景：1、算法整体步骤固定，但其中个别步骤易变；2、需要子类决定父类中某个步骤是否执行
 * JDK源码：InputStream
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        Baocai baocai = new Baocai();
        baocai.cookProcess();

        CaiXin caiXin = new CaiXin();
        caiXin.cookProcess();
    }
}
