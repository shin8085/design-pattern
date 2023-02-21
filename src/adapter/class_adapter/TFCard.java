package adapter.class_adapter;

/**
 * 适配者类接口
 *
 * @author RJZ
 */
public interface TFCard {

    String readTF();

    void writeTF(String value);
}
