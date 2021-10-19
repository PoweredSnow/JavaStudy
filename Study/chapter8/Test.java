public class Test {
    public static void main(String[] args) {
        // 1、创建包装器类型的对象
        // (1)构造方法创建
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("10"); // 字符串要能代表整数数字

        Double d1 = new Double(10.0);

        // (2)调用静态 valueOf 方法创建，类名.静态方法名
        Integer i3 = Integer.valueOf(10);

        Float f1 = Float.valueOf(10.0f);

        // 2、将包装器类型的对象转成基本类型的变量
        int n1 = i1.intValue();
        double dou1 = d1.doubleValue();
        float flo1 = f1.floatValue();

        // 3、包装器类型参与运算
        Integer i4 = new Integer(100);
        // 将 i4 转成基本类型
        // int n4 = i4.intValue(); // 拆箱操作
        // n4++;
        // i4 = Integer.valueOf(n4); // 装箱操作
        // System.out.println(i4);

        i4++; // 自动拆、装箱操作
        System.out.println(i4);

        // 包装器类型之间的判等
        // Integer i5 = 10; // 装箱操作

        // Double d2 = new Double(10.0);
        // Double d3 = new Double(10.0);
        // Double d2 = 10.0; // 装箱操作，等价于
        Double d2 = Double.valueOf(10.0);
        Double d3 = 10.0;
        System.out.println(d2 == d3); // false
        System.out.println(d2.equals(d3)); // true

        // Integer i5 = new Integer(10);
        // Integer i6 = new Integer(10);
        // Integer i5 = 128; // 装箱操作，等价于
        // valueOf 方法实现时，缓存了 -128~127 之间的数
        Integer i5 = Integer.valueOf(128);
        Integer i6 = 128;
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));


        // 调用重载方法时的问题
        /**
         * 1.首先精确匹配
         * 2.基本类型加宽后匹配
         * 3.基本类型装箱后匹配
         * 4.基本类型装箱后再向上转型匹配
         * 5.上述都不符合，匹配可变元参数
         */
        int n = 100;
        TestOverload tol = new TestOverload();
        // tol.fun(n);

        short s1 = 10, s2 = 20;
        tol.fun(s1, s2);

        // tol.fun();

    }
}
