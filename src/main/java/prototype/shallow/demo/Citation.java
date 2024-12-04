package prototype.shallow.demo;

/**
 * 奖状类（浅克隆）
 *
 * @author RJZ
 */
public class Citation implements Cloneable{
    private String studentName;
    private String schoolName;

    public Citation(String studentName, String schoolName) {
        this.studentName = studentName;
        this.schoolName = schoolName;
    }

    public void show(){
        System.out.println(studentName + "同学在2022年第一学期表现优秀，特发此状！————" + schoolName);
    }

    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "studentName='" + studentName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
