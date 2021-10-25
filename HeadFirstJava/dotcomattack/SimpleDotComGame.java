import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom game = new SimpleDotCom();
        int num;
        int lnum = 3;
        int locations[] = new int[lnum];
        int numOfGuesses = 0;
        String result = null;

        for (int i = 0; i < locations.length; i++) {
            num = (int)(Math.random() * 4);
            locations[i] = num;
        }
        game.setLocationCells(locations);
        Scanner input = new Scanner(System.in);
        while (result != "kill") {
            System.out.print("enter a number: ");
            result = game.checkYourself(input.next());
            numOfGuesses++;
        }
        System.out.println("You took " + numOfGuesses + " guesses");
    }
}
