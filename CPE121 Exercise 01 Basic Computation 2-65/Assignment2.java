import java.util.Scanner;
class Assignment2 {
  public static void main(String[] args) {
        Scanner cm = new Scanner(System.in);
            System.out.print("Enter an integer between 000 and 999 : ");
            int integer = cm.nextInt();
            double digitone = integer % 10 ;
            double digittwo = (integer / 10) % 10;
            double digitthree = digittwo % 10;
            double result = digitone * digittwo * digitthree;
            System.out.print("The product of digits is " + result);
  }
}