package Excersice8;
import Excersice8.Fish;
public class SaltedDriedFish extends Fish {
    public SaltedDriedFish(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "I am a " + getWeight() + " kg SaltedDriedFish.";
    }

    public void swim() {
        System.out.println("I am dead and I no longer swim.");
    }
}
