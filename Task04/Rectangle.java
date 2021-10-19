public class Rectangle extends Graphics {

    private double width;
    private double height;

    public Rectangle() {
        super("default", "white", false);
        this.width = 2.0;
        this.height = 3.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return this.getName() + "\n颜色：" + this.getColor() + "\n是否填充：" +
        this.getIsFilled() + "\n长：" + this.getWidth() + "\n宽：" +
        this.getHeight() + "\n面积：" + this.getArea() + "\n周长：" +
        this.getPerimeter();
    }

}
