public class Test {
    public static void main(String[] args) {
        // 类名.静态属性名
        // Student.setCount(10);

        // Student stu1 = new Student();
        // System.out.println(stu1.getCount()); // 1
        // Student stu2 = new Student();
        // System.out.println(stu2.getCount()); // 2
        // System.out.println(stu1.count); // 2
        // System.out.println(stu2.count); // 2
        // System.out.println(Student.count); // 推荐的用法 // 2

        // 类加载到内存的时机：1.类名.访问静态属性或调用静态方法时
        // 创建该类型的对象
        Student.initCount();
        // Student.count = 20;
        // Student stu = new Student();
        Student stu; // 只声明变量时，不会加载类，不会执行静态代码块
        stu = new Student();
        // new Student();
        System.out.println(stu.getName());

        System.out.println(Constant.TABLE_NAME);
        System.out.println(Constant.BASE_URL);
    }
}
