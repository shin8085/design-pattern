package adapter.class_adapter.impl;

import adapter.class_adapter.SDCard;

/**
 * 具体的SD卡
 *
 * @author RJZ
 */
public class SDCardImpl implements SDCard {

    private String value = null;

    @Override
    public String readSD() {
        return value;
    }

    @Override
    public void writeSD(String value) {
        this.value = value;
    }
}
