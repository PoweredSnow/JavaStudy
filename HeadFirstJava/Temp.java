import java.util.ArrayList;

public class Temp {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(1);
        myList.add(2);

        int theSize = myList.size();

        boolean isIn = myList.contains(1);

        int idx = myList.indexOf(2);

        boolean empty = myList.isEmpty();

        myList.remove(2);

        /*
        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        // pets[0].setSize(30);
        int x = pets[0].getSize();
        System.out.println(x);
        // pets[1].setSize(8);
        */

    }
}
