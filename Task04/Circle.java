public class Circle extends Graphics {

    private double r;

    public Circle () {
        super("default", "white", false);
        this.r = 1.0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * 3.14;
    }

    @Override
    public double getPerimeter() {
        return r * 2 * 3.14;
    }

    @Override
    public String toString() {
        return this.getName() + "\n颜色：" + this.getColor() + "\n是否填充：" +
        this.getIsFilled() + "\n半径：" + this.getR() + "\n面积：" +
        this.getArea() + "\n周长：" + this.getPerimeter();
    }

}
