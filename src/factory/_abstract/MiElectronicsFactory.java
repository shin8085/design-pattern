package factory._abstract;

/**
 * 小米电子工厂
 *
 * @author RJZ
 */
public class MiElectronicsFactory implements ElectronicsFactory{
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Computer createComputer() {
        return new MiComputer();
    }
}
