public class Test {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.setName("矩形1");
        rect1.setColor("红色");
        rect1.setIsFilled(false);
        rect1.setWidth(10.0);
        rect1.setHeight(5.0);
        System.out.println(rect1);

        Circle circle1 = new Circle();
        circle1.setName("圆形1");
        circle1.setColor("绿色");
        circle1.setIsFilled(true);
        circle1.setR(3.0);
        System.out.println(circle1);

        Square square1 = new Square();
        square1.setName("正方形1");
        square1.setColor("黄色");
        square1.setIsFilled(false);
        square1.setLength(4.0);
        System.out.println(square1);


        Rectangle rect2 = new Rectangle();
        rect2.setName("矩形2");
        rect2.setWidth(20.0);
        rect2.setHeight(5.0);
        Circle circle2 = new Circle();
        circle2.setName("圆形2");
        circle2.setR(6.0);
        Square square2 = new Square();
        square2.setName("正方形2");
        square2.setLength(8.0);

        Graphics[] aGraphics = {rect1, circle1, square1, rect2, circle2, square2};
        Graphics big = aGraphics[0];
        for (int i = 1; i < aGraphics.length; i++) {
            if (big.compareTo(aGraphics[i]) == -1) {
                big = aGraphics[i];
            }
        }
        System.out.println("面积最大的图形为：" + big.getName());
        System.out.println("面积为：" + big.getArea());
    }
}
