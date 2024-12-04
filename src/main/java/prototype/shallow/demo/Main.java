package prototype.shallow.demo;

/**
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation("小明", "XX市第一中学");

        Citation citation2 = citation1.clone();
        citation2.setStudentName("小红");

        System.out.println(citation1); // Citation{studentName='小明', schoolName='XX市第一中学'}
        System.out.println(citation2); // Citation{studentName='小红', schoolName='XX市第一中学'}

        citation1.show(); // 小明同学在2022年第一学期表现优秀，特发此状！————XX市第一中学
        citation2.show(); // 小红同学在2022年第一学期表现优秀，特发此状！————XX市第一中学
    }
}
