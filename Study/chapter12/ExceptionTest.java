public class ExceptionTest {
    public static void main(String[] args) {
        // 未检查异常：编译阶段不检查是否处理这类异常
        // 空引用异常
        Student stu = null;
        stu = new Student();
        if (null != stu) {
            stu.setStuName("name"); // 编译出错
        }
        // stu.setStuName(null);

        // 算数异常
        /* try {
            div(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } */

        try {
            // 可能会发生异常的 Java 代码

            //字符串的下标越界异常
            String name = "lily";
            char c = name.charAt(0);

            // 数组下标越界异常
            int [] nums = {1, 2, 3};
            // System.out.println(nums[2]);

            // System.out.println("没有发生异常");

            // 强制退出系统
            System.exit(0); // 导致 finally 语句块不能执行
        } catch (StringIndexOutOfBoundsException e) { // 捕获的异常类型
            // 异常处理的 Java 代码
            System.out.println("发生了字符串下标越界异常");
            // 输出异常的堆栈信息
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("发生了数组下标越界异常");
        } catch (Exception e) { // 捕获任意 Exception 子类类型的异常
            System.out.println("发生了异常");
            e.printStackTrace();
        } finally {
            // 不管是否发生异常都执行
            // 资源回收
            System.out.println("finally 语句块");
        }

        // 类型转换异常
        Object obj = "abc"; // 向上转型
        // String str = (String)obj;
        if (obj instanceof Integer) {
            Integer i = (Integer)obj;
        }

        // 检查异常：编译阶段检查是否处理了这类异常，没有处理的话就编译出错
        // ClassNotFoundException 类找不到
        try { // 可能发生异常的代码
            Class.forName("className");
        } catch (ClassNotFoundException e) { // 捕获异常
            // 处理异常
        }

        // 数字格式异常
        // Integer i = new Integer("s");

        Student s = new Student();
        try {
            s.setAge(-10);
        } catch (IlleagalAgeException e) {
            e.printStackTrace();
        }

        // 断言
        int a = 10, b = 20;
        assert a > b; // assert 后面表达式的值是 false 时，抛出 AssertionError 类型异常
        System.out.println("a 大于 b");

        System.out.println("程序能正常结束");
    }

    // 抛出异常（定义方法时使用 throws 关键字声明方法可能会抛出的异常类型）

    private static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }

    // throw 声明发生异常的可能性
    private static int getLength(int[] num) /* throws null */ {
        if (null == num) {
            // throw new NullPointerException();
            NullPointerException e = new NullPointerException();
            throw e; // 抛出异常的动作，执行这句时证明程序真实发生异常
        } else {
            return num.length;
        }
    }
}
