// 定义接口，不允许实例化对象
public interface Trained {
    // 接口中允许定义常量属性， final 可以省略
    final int NUM = 10;

    // int NUM1; // 定义时必须初始化

    // protected int NUM = 10; // 只能定义公有的常量属性，编译出错

    // JDK8 之前，接口中定义的方法必须是抽象方法
    // public abstract void train();
    // protected abstract void train(); // 编译出错
    void train(); // 接口中定义抽象方法可以省略 abstract


    // private String name; //不能定义变量属性， 编译出错

    // 不能定义普通成员方法，编译出错
    // public void setName(String name) {

    // }

    // JDK8.0 新增特性：可以定义 static（静态） 方法和 default 方法
    public static void staticFun() {
        System.out.println("接口中的静态方法");
    }

    public default void defaultFun() {
        System.out.println("接口中的 defalut 方法");
    }

}
