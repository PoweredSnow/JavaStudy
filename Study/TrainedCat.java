// 定义接口的实现类
// 如果实现类不是抽象类，必须重写接口中的抽象方法
// 实现关系类似继承关系
// 同一个类可以实现多个接口，接口名之间用逗号隔开
public class TrainedCat implements Trained, Comparable {
    @Override
    public void train() {
        // 访问接口中定义的常量
        System.out.println(NUM);
        System.out.println("正在训练……");
    }

    @Override
    // 实现类中可以选择是否重写接口中的 defalut 方法
    public void defaultFun() {
        System.out.println("实现类中重写的 default 方法");
    }

    @Override
    public void compareTo(Object obj) {
        // TODO Auto-generated method stub

    }
}
