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

    public double getDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

