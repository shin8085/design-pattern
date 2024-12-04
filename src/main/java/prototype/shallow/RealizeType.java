package prototype.shallow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RJZ
 */
public class RealizeType implements Cloneable {

    private Integer i;
    private String str;
    private Map<String,String> map = new HashMap<>();

    public RealizeType(Integer i, String str, Map<String,String> map){
        this.i = i;
        this.str = str;
        this.map = map;
    }

    public RealizeType clone() throws CloneNotSupportedException {
        return (RealizeType) super.clone();
    }

    public String getStr(){
        return str;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public String toString() {
        return "RealizeType{" +
                "i=" + i +
                ", str='" + str + '\'' +
                ", map=" + map +
                '}';
    }
}
