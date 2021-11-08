// 自定义异常：继承 Java 中某种异常类型
public class IlleagalAgeException extends Exception {

    private int age;

    @Override
    public String getMessage() {
        if (age < 0) {
            return "年龄不能小于 0";
        }
        return "";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println(getMessage());
    }

    @Override
    public String toString() {
        return getClass().getName() + "年龄不合法";
    }
}
