package Quiz5;

public class Sphere {
    public static final double SpherePI = 3.14;
    private double radius;
    public Sphere()
    {
        this.radius = 5;
    }
    public Sphere(double r)
    {
        this.radius = r;
    }
    public double getShpereVolume()
    {
        return (double)((4.0/3.0)*SpherePI*radius*radius);
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getSphereSurface()
    {
        return (double)(4.0*SpherePI*radius*radius);
    }
    public double getSphereMiddleCircumference()
    {
        return 2*SpherePI*radius;
    }
    public void printSphere()
    {
        System.out.println("");
        System.out.println("All parameters of this Sphere");
        System.out.println("Radius = "+ getRadius()+ " cm");
        System.out.println("Sphere Surface Area = "+ getSphereSurface()+ " cm2");
        System.out.println("Sphere Volume = "+ getShpereVolume()+ " cm3");
    }

    public static void main(String[] args) {
        Sphere s = new Sphere();
        System.out.println(s.getShpereVolume());
        Sphere s1 = new Sphere(5.5);
        System.out.println(s1.getSphereMiddleCircumference());
        s.printSphere();
    }
}
