package builder.demo1;

/**
 * @author RJZ
 */
public class MobikeBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("mobike frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("mobike seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}