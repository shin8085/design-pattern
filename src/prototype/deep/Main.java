package prototype.deep;

import singleton.BrokenByDeserialization;

import java.io.*;

/**
 * 深克隆
 *
 * @author RJZ
 */
public class Main {

    private static final String FILE_PATH = "D:\\files\\Documents\\object.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation1 = new Citation(new Student("小明", "XX第一中学"));

        writeObjectToFile(citation1);
        Citation citation2 = readObjectFromFile();

        System.out.println(citation1.getStudent() == citation2.getStudent()); // false

        citation2.getStudent().setName("小红");

        citation1.show(); // 小明同学在2022年第一学期表现优秀，特发此状！————XX第一中学
        citation2.show(); // 小红同学在2022年第一学期表现优秀，特发此状！————XX第一中学
    }

    public static Citation readObjectFromFile() throws IOException, ClassNotFoundException {

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            return  (Citation)inputStream.readObject();
        }
    }


    public static void writeObjectToFile(Citation citation) throws IOException {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(citation);
        }

    }
}
