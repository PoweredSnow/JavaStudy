public class Child extends People {
    People father;

    public Child(String name) {

          System.out.print(3);

          this.name = name;

          father = new People(name + ":F");

         }

    public Child() {

        System.out.print(4);

        }
}
