public class ZookeeperTest{
    public static void main(String[] args){
        Gorilla gorilla1 = new Gorilla();
        gorilla1.throwBanana();
        gorilla1.throwBanana();
        gorilla1.throwBanana();

        gorilla1.eatBananas();
        gorilla1.eatBananas();

        gorilla1.climb();

        gorilla1.displayEnergy();

        Bat bat1 = new Bat();
        bat1.attackTown();
        bat1.attackTown();
        bat1.attackTown();
        
        bat1.eatHuman();
        bat1.eatHuman();
        bat1.fly();
        bat1.fly();
    }
}