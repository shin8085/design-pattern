package builder.demo1;

/**
 * 指挥对象
 *
 * @author RJZ
 */
public class Directer {

    private final Builder builder;

    public Directer(Builder builder){
        this.builder = builder;
    }

    public Bike buildBike(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
