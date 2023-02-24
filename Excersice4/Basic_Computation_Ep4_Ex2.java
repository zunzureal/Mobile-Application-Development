import java.util.Scanner;
public class Basic_Computation_Ep4_Ex2{
  public static void main(String[] args){
        Scanner M1 = new Scanner(System.in);
        System.out.printf("How many line : ");
        int n = M1.nextInt();
        System.out.printf("How long : ");
        double s = M1.nextDouble();
        System.out.println("Area of this program is : " + PYRA.area(n,s));
  }
}



class PYRA {
  public static double area(int n,double side){
    return (n*(Math.pow(side,2))) / 4*Math.tan(3.14/n);
  }
}