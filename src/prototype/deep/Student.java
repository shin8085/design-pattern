package prototype.deep;

import java.io.Serializable;

/**
 * @author RJZ
 */
public class Student implements Serializable {
    private String name;
    private String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
