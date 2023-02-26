public class PuzzlingTest {
    public static void main(String[] args){
        Puzzling appTest = new Puzzling();

        System.out.println(appTest.getTenRolls());
        System.out.println(appTest.getRandomLetter());
        System.out.println(appTest.generatePassword());
        System.out.println(appTest.getNewPasswordSet(10));
    }
}