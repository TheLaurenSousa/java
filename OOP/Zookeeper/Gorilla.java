public class Gorilla extends Mammal{

    public void throwBanana(){
        System.out.println("The gorilla throws a banana!");
        energy -= 5;
        displayEnergy();
    }

    public void eatBananas(){
        System.out.println("The gorilla eats a banana!");
        energy += 10;
        displayEnergy();
    }

    public void climb(){
        System.out.println("The gorilla climbs the structure!");
        energy -= 10;
        displayEnergy();
    }
}