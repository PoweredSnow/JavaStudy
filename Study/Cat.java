// 如果派生类不是抽象类，在派生类中必须重写抽象方法
// 定义一个类时，可以同时实现继承关系和实现关系
public class Cat extends Animal implements Trained {
    @Override
    public void shout() {
        System.out.println("nyanyanya");
    }

    @Override
    public void train() {
        // TODO Auto-generated method stub

    }
}
