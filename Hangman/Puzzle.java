
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Puzzle {
    private static String GuessedLetter;
    private static int CorrectLetter;
    //static String Word;
    private String Word;
    private String[] LetterShowPlace;
    private String Guesses;
    private static ArrayList<String> words;
    private String AlreadyGuessed;
    //static String Object;
    //static char Test;
    //static char Cap;
    
    public Puzzle() {
        words = new ArrayList<String>();
        //ArrayList words = new ArrayList<String>();
        
        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                //String tempWord = scanner.next().toUpperCase();
                String tempWord = scanner.next();
                
                if (Character.isLowerCase(tempWord.charAt(0))){
                    words.add(tempWord);
                }
            }
            scanner.close();
            //ONCE THIS LINE OF CODE IS REACHED, YOUR words ArrayList
            //CONTAINS ALL THE WORDS IN words.txt
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //for (int i = 0; i < words.size(); i++){
        //    Test = words.get(i).charAt(0);
        //    Cap = (words.get(i).toUpperCase()).charAt(0);
        //    if (Test != Cap){
        //        words.remove(i);
        //    }
        //    
        //}
 
        int B = (int) (Math.random()*words.size());
        Word = words.get(B);
        
        CorrectLetter = 0;
        Guesses = " ";
        AlreadyGuessed = "";
        GuessedLetter = "/";
        
        LetterShowPlace = new String[Word.length()];
        for (int i = 0; i < Word.length(); i++){
            LetterShowPlace[i] = "_";
        } 
    }
    
    public boolean makeGuess(String GuessMade){
        GuessedLetter = (GuessMade.substring(0,1)).toLowerCase();
        if (!AlreadyGuessed.contains(GuessedLetter)){
            if (Guesses.length() == 1){
                Guesses += GuessedLetter;
            }
            else {
                Guesses += ", " + GuessedLetter;
            }
            
            for (int i = 0; i < Word.length(); i++){
                if (Word.substring(i,i+1).equals(GuessedLetter)){
                    CorrectLetter++;
                }
            }
     
            if (Word.contains(GuessedLetter)){
                AlreadyGuessed = AlreadyGuessed + GuessedLetter;
                return true;
            }
            return false;
        }
        return true;
    }
    
    public void show(){
        System.out.print("Puzzle: ");
        
        for (int i = 0; i < Word.length(); i++){
            if (LetterShowPlace[i] == "_"){
                if ((Word.substring(i,i+1)).equals(GuessedLetter)){
                    LetterShowPlace[i] = GuessedLetter.toUpperCase();
                }
            }
        }
        
        for (int i = 0; i < Word.length(); i++){
            System.out.print(LetterShowPlace[i] + " ");
        }
        //System.out.print("\n\nGuesses: ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Guesses:"); 
        
        System.out.print(Guesses.toUpperCase());
        
    }
    
    public String getWord(){
        return Word;
    }
    
    public boolean isUnsolved(){
        //return false;// Win
        //return true;// keep Guessing
        
        //if (!AlreadyGuessed.contains(GuessedLetter)){
        //}
        
        System.out.println(CorrectLetter);
        if (CorrectLetter == Word.length()){
            return false;
        }
        else {
            return true;
        }
        
        
        //return isUnsolved(); 
    }
}
