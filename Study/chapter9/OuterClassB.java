public class OuterClassB {
    // 成员属性、方法
    private String outerStr;

    public String getOuterStr() {
        return outerStr;
    }

    public void setOuterStr(String outerStr) {
        this.outerStr = outerStr;
        // 不能使用局部内部类
    }

    public void outerFun(int num) {
        // 局部变量
        final float f = 10.0f;
        // f = 20.0f;
        // 局部内部类
        class InnerClassB {
             // 内部类的成员属性和方法
            private String innerStr;

            public String getInnerStr() {
                return innerStr;
            }

            public void setInnerStr(String innerStr) {
                this.innerStr = innerStr;
            }

            public void innerFun() {
                // 局部内部类中，可以直接访问外部类的成员
                outerStr = "abc";
                System.out.println(num); // 访问外包方法中的参数
                // f = 20.0f;
                System.out.println(f); // 访问外包方法中的局部常量
            }
        }

        // 创建局部内部类的对象
        InnerClassB innerB = new InnerClassB();
        innerB.innerStr = "123";
        innerB.innerFun();
    }

}
