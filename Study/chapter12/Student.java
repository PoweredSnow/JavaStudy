public class Student {

    private String stuName;
    private int age;

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setAge(int age) throws IlleagalAgeException {
        if (age < 0) {
            // 抛出自定义类型的异常
            throw new IlleagalAgeException();
        } else {
            this.age = age;
        }
    }
}
