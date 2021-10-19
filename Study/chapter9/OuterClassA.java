public class OuterClassA {
    // 成员属性、方法
    private String outerStr;

    // 同内部类同名的属性
    private int num = 10;

    public String getOuterStr() {
        return outerStr;
    }

    public void setOuterStr(String outerStr) {
        this.outerStr = outerStr;
    }

    public void outerFun() {
        // 外部类中不能直接访问内部类的成员
        // innerStr = "123"; // 编译出错
        // setInnerStr(""); // 编译出错

        // 创建成员内部类的对象去访问它
        InnerClassA innerA = new InnerClassA();
        innerA.innerStr = "123";
        innerA.getClass();
    }

    // 成员内部类
    public class InnerClassA {
        // 内部类的成员属性和方法
        private String innerStr;

        private int num = 20;

        public String getInnerStr() {
            return innerStr;
        }

        public void setInnerStr(String innerStr) {
            this.innerStr = innerStr;
        }

        public void innerFun() {
            // 成员内部类中，可以直接访问外部类的成员
            outerStr = "abc";
            System.out.println(num); // 20
            System.out.println(this.num); // 20
            System.out.println(OuterClassA.this.num); // 10
        }
    }
}
