import java.util.Scanner;
public class Basic_Computation_Ep4_Ex6{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
        System.out.println("Enter a point(x1,y1) and (x2,y2) : ");
        int x1 = M1.nextInt();
        int y1 = M1.nextInt();
        int x2 = M1.nextInt();
        int y2 = M1.nextInt();
        double a1 = (double) x1;
        double b1 = (double) y1;
        double a2 = (double) x2;
        double b2 = (double) y2;
        System.out.println("The distance value of point(" + x1 + "," + y1 + ") and point (" + x2 + "," + y2 + ") is " + 
                           Ender.distance(x1,y1,x2,y2));
        System.out.println("The distance value of point(" + a1 + "," + b1 + ") and point (" + a2 + "," + b2 + ") is " + 
                           Ender.distance(a1,b1,a2,b2));  
  }
}

class Ender{
  public static int distance(int x1,int y1,int x2,int y2){
   double D;
   D = Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
   int c = (int) D;
   return(c);
  }
  public static double distance(double x1,double y1,double x2,double y2){
   double D;
   D = Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
   return(D);
}
}