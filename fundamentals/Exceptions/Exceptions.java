import java.util.ArrayList;
public class Exceptions {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i=0; i<myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
            } catch (ClassCastException e){
                System.out.println("Oops! There's an error at index " + i + ". The value was: " + myList.get(i));
            }
        }
    }
}


// Change the program above to utilize exception handling to print out the error messages, 
// the index of the ArrayList where the error occurred, and the value of the object that triggered the error. 
// The program should continue after printing this to the console.