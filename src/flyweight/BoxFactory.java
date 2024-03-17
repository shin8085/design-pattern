package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 *
 * @author RJZ
 */
public class BoxFactory {

    private final Map<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
    }

    private static class BoxFactoryHolder {
        public static final BoxFactory INSTANCE = new BoxFactory();
    }

    public static BoxFactory getInstance() {
        return BoxFactoryHolder.INSTANCE;
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
