public class Test_0 {
    public static void main(String[] args) {
        // 不能创建抽象类的对象
        // Animal a = new Animal(); // 编译出错

        Cat c = new Cat();
        c.shout();

        Animal a = new Cat(); // 向上转型
        a.shout();

        // 不能实例化接口对象
        // Trained t = new Trained(); // 编译出错

        TrainedCat tc = new TrainedCat();
        tc.train();

        Trained t = new TrainedCat();
        t.train();
    }
}
