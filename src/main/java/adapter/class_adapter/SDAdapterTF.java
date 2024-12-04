package adapter.class_adapter;

import adapter.class_adapter.impl.TFCardImpl;

/**
 * 适配器类
 *
 * @author RJZ
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String value) {
        writeTF(value);
    }
}
