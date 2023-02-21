package adapter.class_adapter.impl;

import adapter.class_adapter.TFCard;

/**
 * 适配者类
 *
 * @author RJZ
 */
public class TFCardImpl implements TFCard {

    private String value = null;

    @Override
    public String readTF() {
        return value;
    }

    @Override
    public void writeTF(String value) {
        this.value = value;
    }
}
