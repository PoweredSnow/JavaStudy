public class Test {
    public static void main(String[] args) {
        // 创建成员内部类的对象
        // 1.创建外部类的对象
        OuterClassA outer = new OuterClassA();
        // 2.创建内部类的对象
        OuterClassA.InnerClassA innerA = outer.new InnerClassA();
        innerA.setInnerStr("abc");

        OuterClassC outerc = new OuterClassC();
        // new 接口名/基类名(){//匿名类定义的范围}
        outerc.outerFun1(new ITest(){
            @Override
            public void test() {
                System.out.println("参数中可以直接使用匿名内部类");
            }
        }); // 匿名内部类
    }
}

class A {

}
