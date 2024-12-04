package factory._abstract;

/**
 * 联想电子工厂
 *
 * @author RJZ
 */
public class LenovoElectronicsFactory implements ElectronicsFactory{
    @Override
    public Phone createPhone() {
        return new LenovoPhone();
    }

    @Override
    public Computer createComputer() {
        return new LenovoComputer();
    }
}
