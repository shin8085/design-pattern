package adapter.object_adapter;

import adapter.class_adapter.Computer;
import adapter.class_adapter.SDCard;
import adapter.class_adapter.impl.SDCardImpl;
import adapter.class_adapter.impl.TFCardImpl;

import java.io.InputStreamReader;

/**
 * 对象适配器模式
 * 符合合成复用原则
 *
 * @see InputStreamReader
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();

        SDCard sdCard = new SDCardImpl();
        sdCard.writeSD("this is a sd card");
        System.out.println(computer.readSD(sdCard));

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        sdAdapterTF.writeSD("this is a tf card");
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
