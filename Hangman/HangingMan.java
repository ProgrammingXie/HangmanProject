public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+// Nothing
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+// Add Head
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+// Add Body
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+// Add Right Arm
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",


                                "+----+\n"+// Add Left Arm
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",


                                "+----+\n"+// Add Left Leg
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",


                                "+----+\n"+// Add Right Leg
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
    public HangingMan (){
        this.numWrongGuesses = 0;
    }               
             
    public void show(){
        if (this.numWrongGuesses == 0){       
            System.out.println(HangmanImage[0]);
        }   
        else if (this.numWrongGuesses == 1){
            System.out.println(HangmanImage[1]);
        }
        else if (this.numWrongGuesses == 2){
            System.out.println(HangmanImage[2]);
        }
        else if (this.numWrongGuesses == 3){
            System.out.println(HangmanImage[3]);
        }
        else if (this.numWrongGuesses == 4){
            System.out.println(HangmanImage[4]);
        }
        else if (this.numWrongGuesses == 5){
            System.out.println(HangmanImage[5]);
        }
        else if (this.numWrongGuesses == 6){
            System.out.println(HangmanImage[6]);
        }
    }
    
    public boolean isntDead(){
        if (this.numWrongGuesses == 6){
            return false;
        }
        return true;
    }      
    
    public void dieSomeMore(){       
        this.numWrongGuesses++;
    }
}
