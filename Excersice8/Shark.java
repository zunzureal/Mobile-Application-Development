package Exercise8;

import Excersice8.Fish;

public class Shark extends Fish {
    public Shark(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "I am a " + getWeight() + " kg shark";
    }

}
