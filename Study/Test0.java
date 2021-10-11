public class Test0 {
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

        Trained t = new TrainedCat(); // 向上转型
        t.train();

        // 接口中静态方法的调用：接口名.静态方法名()
        Trained.staticFun();

        // 接口中 default 方法的调用：实现类对象名.default方法名()
        t.defaultFun(); // 运行期间指向实现类中重写的 defaultFun 方法

        Object obj = "abc"; // Object 类型的引用可以指向任意类型的对象
        // 基类中的引用只能调用在基类中定义的方法
        Object obj1 = new TrainedCat(); // 向上转型
        // obj1.train();

        fun(obj1);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        // cat2 = cat1;
        cat1.setColor("orange");
        cat2.setColor("orange");

        // 比较两个对象是否相等
        //判等号比较两个引用类型的变量时，判断是否指向同一个对象
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1); // 输出对象时默认调用了 toString 方法
        System.out.println(cat1.toString());

        String s1 = new String();
        String s2 = new String();
        System.out.println(s1.equals(s2));
    }

    public static void fun(Object obj) {
        // 获取对象的运行时类型
        System.out.println(obj.getClass());
        if (obj instanceof TrainedCat) {
            TrainedCat tc = (TrainedCat)obj;
            tc.train();
        }
    }
}
