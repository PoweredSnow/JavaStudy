public abstract class Graphics implements Comparable {

    private String name;
    private String color;
    private Boolean isFilled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIsFilled() {
        return isFilled;
    }

    public void setIsFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Graphics() {
        name = "default";
        color = "white";
        isFilled = false;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return name + "\n颜色：" + color + "\n是否填充：" + isFilled;
    }

    @Override
    public int compareTo(Graphics other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        } else if (this.getArea() == other.getArea()) {
            return 0;
        }
        return -1;
    }
}
