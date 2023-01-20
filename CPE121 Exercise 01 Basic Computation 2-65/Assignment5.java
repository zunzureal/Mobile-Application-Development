import java.util.Scanner;
class Assignment5 {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter a degree in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double result = (fahrenheit - 32) * 0.55555555555555556;
            System.out.print(fahrenheit + " Fahrenheit is "+ (float)result + " Celsius");
  }
}