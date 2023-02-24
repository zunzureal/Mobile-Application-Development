import java.util.Scanner;
public class preQ42{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
    System.out.println("1:rectangle 2:circle 3: Triangle ");
    int choose = M1.nextInt();
    switch(choose){
      case(1):
        System.out.println("Enter w and l : ");
        int w = M1.nextInt();
        int l = M1.nextInt();
        System.out.println("The perimeter of rectangle is : " + lockheed.perimeter(w,l));
      break;
      case(2):
        System.out.println("Enter r : ");
        int r = M1.nextInt();
        System.out.println("The perimeter of circle is : " + lockheed.perimeter(r));        
        break;
      case(3):
        System.out.println("Enter a , b , c : ");
        int a = M1.nextInt();
        int b = M1.nextInt();
        int c = M1.nextInt();
        System.out.println("The perimeter of triangle is : " + lockheed.perimeter(a,b,c));
        break;
      default:
        System.out.println("Wrong input!");
    }
  }
}

class lockheed{
  public static double perimeter(int w,int l){
    double peri = w * l;
    return(peri);
  }
  public static double perimeter(int r){
    double peri = 2f*3.14f*r;
    return(peri);
  }
  public static double perimeter(int a,int b,int c){
    double peri = a*b*c;
    return(peri);
  }
}