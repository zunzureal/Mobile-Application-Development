package Exercise8;

import Excersice8.Fish;

public class MechanicalFish extends Fish {
    public MechanicalFish(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "I am a " + getWeight() + " kg MechanicalFish.";
    }

    public void swim(){
        System.out.println("I float in water.");
    }
}
