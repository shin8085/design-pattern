package prototype.deep;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 奖状类（深克隆）
 *
 * @author RJZ
 */
public class Citation implements Serializable {

    private Student student;

    public Citation(Student student){
        this.student = student;
    }

    public void show(){
        System.out.println(student.getName() + "同学在2022年第一学期表现优秀，特发此状！————" + student.getSchool());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
