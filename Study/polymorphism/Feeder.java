public class Feeder {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    // 喂养猫
    public void feed(Cat cat) {
        System.out.print(name + "喂");
        cat.eat();
    }

    // 喂养狗
    public void feed(Dog dog) {
        System.out.print(name + "喂");
        dog.eat();
    }
    */

    // 向上转型
    public void feed(Animal animal) {
        System.out.print(name + "喂");
        animal.eat();
    }
}
