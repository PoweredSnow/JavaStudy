public class OuterClassD {

    private String outerStr;

    public static int num;

    // 外部类的成员方法
    public void outerFun() {
        // 访问内部类的属性和方法
        InnerClassD inner = new InnerClassD();
        inner.innerStr = "abc";
        inner.getInnerStr();
    }

    // 静态内部类
    public static class InnerClassD {
        // 内部类的成员属性和方法
        private String innerStr;

        // 只有在静态内部类中，才可以定义静态成员，其他3种内部类不可以
        private static String staticStr;

        public String getInnerStr() {
            return innerStr;
        }

        public void setInnerStr(String innerStr) {
            this.innerStr = innerStr;
        }

        public void innerFun() {
            // 静态内部类中不能访问外部类的非静态属性和方法
            // outerStr = "123";
            num = 10;
        }
    }
}
