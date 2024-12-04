package decorator;

/**
 * 炒饭（具体构件角色）
 *
 * @author RJZ
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
