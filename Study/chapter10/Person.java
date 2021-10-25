public class Person {
    static {
        System.out.println("基类中的静态代码块");
    }

    {
        System.out.println("基类的非静态代码块");
    }
}
