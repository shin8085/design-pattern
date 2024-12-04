package adapter.class_adapter;

import adapter.class_adapter.impl.SDCardImpl;

/**
 * 类适配器模式
 * 违背了合成复用原则，在客户类有接口的情况下可用
 *
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();

        SDCard sdCard = new SDCardImpl();
        sdCard.writeSD("this is a sd card");
        System.out.println(computer.readSD(sdCard));

        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        sdAdapterTF.writeTF("this is a tf card");
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
