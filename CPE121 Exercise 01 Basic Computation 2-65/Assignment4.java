import java.util.Scanner;
class Assignment4 {
  public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        float weight = bmi.nextInt();
        System.out.print("Enter height in cm: ");
        float height = bmi.nextInt();
        float heightbmi = (height / 100) * (height / 100);
        float bmiresult = weight / heightbmi;
        System.out.print("BMI is "+ bmiresult);
  }
}