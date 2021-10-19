public class OuterClassC {
    public void outerFun() {
        // 特点同局部内部类一致（属于一种特殊的局部内部类）
        // 匿名内部类（定义 ITest 接口实现类）
        // 创建对象和类的定义一起完成（一个匿名内部类的对象只有一个）
        ITest t = new ITest(){ // 匿名实现类的范围
            @Override
            public void test() {
                System.out.println("重写 test 方法");
            }
        };

        t.test();
    }

    public void outerFun1(ITest t) {
        t.test();
    }
}
