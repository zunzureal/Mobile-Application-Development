import Excersice8.Fish;
public class test {
    public static void main(String args[]) {

        Fish fish = new Fish(0.3);
        System.out.print(fish);
        fish.swim();
        Fish shark = new Exercise8.Shark(300);
        System.out.print(shark);
        fish.swim();
        Fish mFish = new Exercise8.MechanicalFish(1.2);
        System.out.print(mFish);
        mFish.swim();
        Fish sdFish = new Excersice8.SaltedDriedFish(1.2);
        System.out.print(sdFish);
        sdFish.swim();
    }
}

