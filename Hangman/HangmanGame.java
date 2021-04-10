import java.util.*;

public class HangmanGame {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangingMan hangingMan = new HangingMan();
        Puzzle puzzle = new Puzzle();

        while (puzzle.isUnsolved() && hangingMan.isntDead()) {// check true or false
            hangingMan.show();// show
            puzzle.show();// show
            
            //System.out.println(Puzzle.Word);
            //System.out.println(Puzzle.words.size());
            //System.out.println(Puzzle.Test);
            //System.out.println(Puzzle.Cap);
            
            System.out.print("\nMake a guess: ");
            String guess = scanner.nextLine();
            if (!puzzle.makeGuess(guess)) {// check for correct guess true or false
                hangingMan.dieSomeMore();// mutator change image
            }
            //System.out.println(Puzzle.Word);
            //System.out.println(Puzzle.Object);
            clearScreen();
        }

        if (hangingMan.isntDead()) {//check true or false
            System.out.println("You win!");
        } else {
            System.out.println("You lose! The word was " + puzzle.getWord());// show word
        }
    }

    public static void clearScreen() {
        System.out.println("\f");
    }
}