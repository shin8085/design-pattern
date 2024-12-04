package adapter.object_adapter;

import adapter.class_adapter.SDCard;
import adapter.class_adapter.TFCard;

/**
 * @author RJZ
 */
public class SDAdapterTF implements SDCard {

    final private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String value) {
        tfCard.writeTF(value);
    }
}
