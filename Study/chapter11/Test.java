public class Test {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        printColor(c1);
    }

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
}
