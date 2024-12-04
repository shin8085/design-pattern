package builder.demo1;

/**
 * @author RJZ
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("ofo frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
