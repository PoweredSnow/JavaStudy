public class TestOverload {

    // public void fun(int x) {
    //     System.out.println("int");
    // }

    // public void fun(Integer i) {
    //     System.out.println("Integer");
    // }

    // public void fun(double d) {
    //     System.out.println("double");
    // }

    public void fun(Object obj) {
        System.out.println("Object");
    }

    // public void fun(int x, int y) {
    //     System.out.println("int int");
    // }

    // public void fun(Short s1, Short s2) {
    //     System.out.println("Short Short");
    // }

    public void fun (short...s) { // 可变元参数：可以传入 0~n 个 short 类型的参数
        System.out.println("short...");
    }

}
