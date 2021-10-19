public class Square extends Graphics {

    private double length;

    public Square() {
        super("default", "white", false);
        this.length = 4.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return this.getName() + "\n颜色：" + this.getColor() + "\n是否填充：" +
        this.getIsFilled() + "\n边长：" + this.getLength() + "\n面积：" +
        this.getArea() + "\n周长：" + this.getPerimeter();
    }

}
