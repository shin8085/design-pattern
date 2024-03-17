package flyweight;

/**
 * I图形类（具体享元角色）
 *
 * @author RJZ
 */
public class IBox extends AbstractBox{

    @Override
    public String getShape() {
        return "I";
    }

}
