public class Test {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.RED;
        System.out.println(c1 == c2); // true
        System.out.println(c1.equals(c2)); // true
        System.out.println(c1.name()); // 获取枚举对象的名称
        System.out.println(c1.ordinal()); // 获得枚举对象定义的
        System.out.println(c1.getDeclaringClass());
        // printColor(c1);
    }

    /*
    private static void printColor(Color c) {
        switch (c) { // byte/short/int/char/String/enum
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            default:
                break;
        }
    }
    */
}
