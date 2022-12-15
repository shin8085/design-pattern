package factory.config;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author RJZ
 */
public class CoffeeFactory {

    private static final Map<String, Coffee> nameToCoffee = new HashMap<>();

    // 加载配置文件
    static {

        Properties properties = new Properties();
        loadProperties(properties);

        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            Coffee coffee = getCoffeeByClassName((String) entry.getValue());
            nameToCoffee.put((String)entry.getKey(), coffee);
        }

    }

    private static void loadProperties(Properties properties){
        try(InputStream resourceAsStream = CoffeeFactory.class.getResourceAsStream("bean.properties")){
            properties.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Coffee getCoffeeByClassName(String className){
        try {
            Class<?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            return (Coffee) constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String name){
        return nameToCoffee.get(name);
    }
}
