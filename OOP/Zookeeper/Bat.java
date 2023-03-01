public class Bat extends Mammal{
    
    public Bat(){
        this.energy = 300;
    }

    public void fly(){
        System.out.println("The bat takes to the sky!");
        energy -= 50;
        displayEnergy();
    }

    public void eatHuman(){
        System.out.println("The bat eats a human!");
        energy += 25;
        displayEnergy();
    }

    public void attackTown(){
        System.out.println("The bat attacks a town!");
        energy -= 100;
        displayEnergy();
    }

    public void displayEnergy(){
        System.out.println("Bat Energy remaining: " + energy + "/300");
    }
}