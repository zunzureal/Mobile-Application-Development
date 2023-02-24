import java.util.Scanner;
public class Basic_Computation_Ep4_Ex7{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
    System.out.println("Select data type of all numbers 1.int 2.double : ");
    int choose = M1.nextInt();
    switch(choose){
      case(1):
        System.out.println("Enter five number : ");
        int x1 = M1.nextInt();
        int x2 = M1.nextInt();
        int x3 = M1.nextInt();
        int x4 = M1.nextInt();
        int x5 = M1.nextInt();
        System.out.println("Average value : " + Ovaltin.average(x1,x2,x3,x4,x5));
        break;
      case(2):
        System.out.println("Enter five number : ");
         double a1 = M1.nextDouble();
         double a2 = M1.nextDouble();
         double a3 = M1.nextDouble();
         double a4 = M1.nextDouble();
         double a5 = M1.nextDouble();
        System.out.println("Average value : " + Ovaltin.average(a1,a2,a3,a4,a5));
        break;
      default:
      System.out.println("Wrong input!!");
    }
  }
}





class Ovaltin{
  public static int average(int i1,int i2,int i3,int i4,int i5){
    double x = (i1 + i2 + i3 + i4 + i5) / 5 ;
    int xbar = (int) x;
    return(xbar);
  }
  public static double average(double i1,double i2,double i3,double i4,double i5){
    double x = (i1 + i2 + i3 + i4 + i5) / 5 ;
    return(x);
}
}