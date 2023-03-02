import java.util.Scanner;
class Assignment1_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a, b, c, d, e, f: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();
    double g = (a*d) - (b*c);
    double x, y;
     if (g != 0) {
     x = ((e*d) - (b*f)) / ((a*d) - (b*c));
     y = ((a*f) - (e*c)) / ((a*d) - (b*c));
     System.out.print("x is " + x + " and y is " + y);
  }
    else {
      System.out.print("The equation has no solution");
    }
}
}    