package decorator;

/**
 * 炒面（具体的构件角色）
 *
 * @author RJZ
 */
public class FriedNoodle extends FastFood{

    public FriedNoodle(){
        super(8, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
