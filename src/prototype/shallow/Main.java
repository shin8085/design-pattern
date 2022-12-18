package prototype.shallow;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型模式：浅拷贝
 * 使用场景：1、对象的创建非常复杂 2、性能和安全要求较高
 *
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Integer i = 1;
        String str = "first";
        Map<String, String> map = new HashMap<>();
        map.put("test","test");


        RealizeType realizeType = new RealizeType(i, str, map);
        RealizeType clone = realizeType.clone();

        System.out.println(clone); // RealizeType{i=1, str='first', map={test=test}}
        System.out.println(realizeType == clone); // false
        System.out.println(i.hashCode() == clone.getI().hashCode()); // true
        System.out.println(str.hashCode() == clone.getStr().hashCode()); //true
        System.out.println(clone.getMap() == map); // true
    }
}
