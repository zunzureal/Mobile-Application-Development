public class Triangle {
    private double s1;
    private double s2;
    private double s3;

    public Triangle()
    {
        s1 = 0;
        s2 = 0;
        s3 = 0;
    }

    public Triangle(double s1, double s2, double s3)
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1()
    {
        return s1;
    }

    public double getS2()
    {
        return s2;
    }

    public double getS3()
    {
        return s3;
    }

    public double getArea()
    {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    public double getPerimeter()
    {
        return s1 + s2 + s3;
    }

    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(6, 7, 8);
        System.out.println("First Triangle (T1)\n-----------\nTriangle's Area = " + t1.getArea()+"\nPerimeter of the triangle: " + t1.getPerimeter());
        System.out.println("\nSecond Triangle (T2)\n-----------\nTriangle's Area = " + t2.getArea()+"\nPerimeter of the triangle: " + t2.getPerimeter());
    }
}
