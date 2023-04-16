package Excersice8;

public class Fish {
    private double weight;

    public Fish(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "I am a " + getWeight() + " kg fish.";
    }

    public void swim() {
        System.out.println("All fish swim.");
    }
}
