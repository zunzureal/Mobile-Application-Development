import java.util.Scanner;
class Assignment1 {
  public static void main(String[] args) {
        Scanner cm = new Scanner(System.in);
            System.out.print("Enter inches as an integer : ");
            int inches = cm.nextInt();
            double centi = inches / 0.3937 ;
            System.out.print("The value in centimeters is " + centi);
  }
}