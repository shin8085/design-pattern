package factory._abstract;

/**
 * 抽象工厂模式
 * 缺点：当产品族需要增加一个新的产品时，所有的工厂类都需要修改
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        MiElectronicsFactory miFactory = new MiElectronicsFactory();
        Phone miPhone = miFactory.createPhone();
        Computer miComputer = miFactory.createComputer();
        miPhone.call();
        miComputer.play();

        LenovoElectronicsFactory lenovoFactory = new LenovoElectronicsFactory();
        Phone lenovoPhone = lenovoFactory.createPhone();
        Computer lenovoComputer = lenovoFactory.createComputer();
        lenovoPhone.call();
        lenovoComputer.play();
    }
}
