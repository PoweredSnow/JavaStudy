// 抽象派生类中，不是必须重写抽象基类中的抽象方法
public abstract class Dog extends Animal {
    @Override
    // 可以选择性重写抽象方法
    public void shout() {
        System.out.println("汪汪汪！");
    }
}
