package decorator;

import java.io.BufferedWriter;

/**
 * 装饰者模式
 *
 * @see BufferedWriter
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        // 点一份炒饭
        FastFood friedRice = new FriedRice();
        System.out.printf("%s %f \n", friedRice.getDesc(), friedRice.cost());

        // 加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.printf("%s %f \n", friedRice.getDesc(), friedRice.cost());

        // 加一个培根
        friedRice = new Bacon(friedRice);
        System.out.printf("%s %f \n", friedRice.getDesc(), friedRice.cost());

    }
}
