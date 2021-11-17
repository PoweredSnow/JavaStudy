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

    public Graphics(String name, String color, Boolean isFilled) {
        this.name = name;
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

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
