public class Circle {
    public static final double CirclePI = 3.14;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return CirclePI * radius * radius;
    }

    public double getCircumference() {
        return 2 * CirclePI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0/3.0) * CirclePI * radius * radius * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);

        System.out.println("First Circle (C1) \n -------\nCircle's Area = " + c1.getArea() + "\nCircle's Volume = " + c1.getVolume()+"\nCircle's Circumference = "+ c1.getCircumference());
        System.out.println("\nFirst Circle (C2) \n -------\nCircle's Area = " + c2.getArea() + "\nCircle's Volume = " + c2.getVolume()+"\nCircle's Circumference = "+ c2.getCircumference());
    }
}
