import java.util.Random;
import java.util.ArrayList;

public class Puzzling {

    public ArrayList getTenRolls(){
        Random randMachine = new Random();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i=0; i< 10; i++){
            rolls.add(randMachine.nextInt(1,21));
        }
        return rolls;
    }

    public char getRandomLetter(){
        Random randMachine = new Random();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int index = randMachine.nextInt(0,26);
        return alphabet[index];
    }

    public String generatePassword(){
        String output = new String();
        for(int i=0; i<8; i++){
            char rand = getRandomLetter();
            output += rand;
        }
        return output;
    }

    public ArrayList getNewPasswordSet(int num){
        ArrayList<String> output = new ArrayList<String>();
        for(int i=0; i<num; i++){
            String password = generatePassword();
            output.add(password);
        }
        return output;
    }
}