public class Student extends Person {
    // 定义属性时的赋值语句和非静态代码块：先定义先执行
    // 定义静态属性时的赋值语句和静态代码块：先定义先执行
    // 静态属性
    public static int count = 0; // 统计一共创建的学生对象的个数

    // 静态代码块（当前类加载到内存时，自动执行）
    static { // 任意的 Java 代码
        System.out.println("Student 类中的静态代码块");
        count = 10;
    }

    // 非静态代码块（每创建一个对象时都会自动执行）
    { // 任意的 Java 代码
        System.out.println("派生类的非静态代码块");
        name = "张三";
    }

    private String name = "lily";

    public Student() {
        count++;
        // name = "李四";
    }

    public int getCount() {
        return count;
    }

    // 静态方法（可以在创建对象之前，完成静态属性的初始化）
    public static void initCount() {
        // 完成静态属性的初始化
        count = 20;
        // 不能访问非静态属性和方法（当前静态方法执行时，可能还不存在任何的对象）
        // name = "张三";
        // this.setName("123"); // 不能使用 this 和 super
    }

    public String getName() {
        return name;
    }

}
