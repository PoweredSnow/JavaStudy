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

    @Override
    public boolean equals(Object obj) {
        // 比较 this 和 obj 各个属性的值是否一致
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cat) {
            Cat cat = (Cat)obj;
            if (!this.color.equals(cat.getColor())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        // 当前对象的各个属性的值，拼接成一个字符串
        return "颜色：" + color;
    }
}
