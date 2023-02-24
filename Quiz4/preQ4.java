import java.util.Scanner;
public class preQ4{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
     System.out.println("Enter inner r");
     double ir = M1.nextDouble();
     System.out.println("Enter outer r");
     double or = M1.nextDouble();
     System.out.println("Enter inner h");
     double ih = M1.nextDouble();
     System.out.println("Enter outer h");
     double oh = M1.nextDouble();
     System.out.println("The different volume of 2 Circular Cones is: " + Volume.circularConeVolumeDif(or,ir,oh,ih));
  }
}

class Volume{
  public static double circularConeVolumeDif(double radiusOut,double radiusIn,
                                             double heightOut,double heightIn){
    double inner = (1f/3f) * 3.14f * Math.pow(radiusIn,2) * heightIn;
    System.out.println(inner);
    double outer = (1f/3f) * 3.14f * Math.pow(radiusOut,2) * heightOut;
    System.out.println(outer);
    double volume = outer - inner;
    return(volume);
  }
}