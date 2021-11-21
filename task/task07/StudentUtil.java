import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    private List<Student> stus = new ArrayList<Student>();

    void initList() {
        Student stu1 = new Student(1, "张三", "男", new Major("1班", "Java"));
        Student stu2 = new Student(2, "李四", "女", new Major("2班", "H5"));
        Student stu3 = new Student(3, "王五", "男", new Major("3班", "测试"));
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
    }

    int countStudent(String proDirection) {
        int count = 0;
        for (Student stu : stus) {
            if (stu.getsMajor().getProDirection().equals(proDirection)) {
                count++;
            }
        }
        return count;
    }

    int countStudentByGender(String gender) {
        int count = 0;
        for (Student stu : stus) {
            if (stu.getsGender().equals(gender)) {
                count++;
            }
        }
        return count;
    }

    boolean modifyStudentBySNo(Student stu, int sNO) {
        for (int i = 0; i < stus.size(); i++) {
            if (stu.getsNO() == sNO) {
                stus.set(i, stu);
                return true;
            }
        }
        return false;
    }
}
