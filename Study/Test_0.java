public class Test_0 {
    public static void main(String[] args) {
        // Animal a = new Animal(); // 编译出错

        Cat c = new Cat();
        c.shout();

        Animal a = new Cat();
        a.shout();
    }
}
