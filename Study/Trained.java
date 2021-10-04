// 定义接口，不允许实例化对象
public interface Trained {
    // 接口中允许定义常量属性， final 可以省略
    final int NUM = 10;

    // protected int NUM = 10; // 只能定义公有的常量属性，编译出错

    // JDK8 之前，接口中定义的方法必须是抽象方法
    // public abstract void train();
    // protected abstract void train(); // 编译出错
    void train(); // 接口中定义抽象方法可以省略 abstract


    // private String name; //不能定义变量属性， 编译出错

    // 不能定义普通成员方法，编译出错
    // public void setName(String name) {

    // }
}
