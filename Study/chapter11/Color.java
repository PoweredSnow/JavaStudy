// 默认继承了 Enum 类型
public enum Color {
    // Enum
    // 数据元素（常量）
    // RED,
    // BULE,
    // GREEN();

    // 枚举对象
    RED("红色", 1),
    BLUE("蓝色", 2),
    GREEN("绿色", 3);

    // 定义属性和方法
    private String colorName;
    private int colorId;

    // 定义构造方法（只能是私有的）
    private Color(String colorName, int colorId) {
        System.out.println("属性的初始化");
        this.colorName = colorName;
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorId() {
        return colorId;
    }
}
