public class Test {
    public static void main(String[] args) {
        // Animal cat = new Cat(); // 向上转型
        // cat 变量编译时类型：Animal
        // cat 变量运行时类型：Cat
        // cat.fun(); // 编译出错，基类类型的引用不能访问派生类中新增的成员
        // cat.eat(); // eat 方法在派生类中进行了重写，运行期间会执行派生类中重写的 eat 方法
        // cat.setColor("color"); // setColor 在派生类中没有重写，运行期间指向基类中的 setColor 方法

        Feeder feeder1 = new Feeder();
        feeder1.setName("张三");

        Cat cat1 = new Cat();
        cat1.setColor("花猫");

        feeder1.feed(cat1); // 向上转型：形参类型是基类类型，实参类型是派生类类型

        Dog dog1 = new Dog();

        feeder1.feed(dog1);
    }
}
