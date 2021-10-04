// abstract 定义抽象类
// 抽象类不能实例化对象
public abstract class Animal {

    // 可以定义普通的成员属性和方法
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 可以定义构造方法
    public Animal() {

    }

    // 可以定义抽象方法（没有具体实现，没有大括号，直接分号结束）
    public abstract void shout();
}
