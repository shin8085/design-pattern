package factory._abstract;

/**
 * 电子工厂
 * 生产同一产品族的产品
 *
 * @author RJZ
 */
public interface ElectronicsFactory {

    Phone createPhone();

    Computer createComputer();
}
