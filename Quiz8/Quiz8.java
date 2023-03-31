import java.util.Scanner;

public class Quiz8
{
  public static void main(String[] args) {
   Scanner F1 = new Scanner(System.in);
   int j =0;
   double[] x = new double[25];
     
  try
  {
   System.out.println("Program for computing the equation of a straight-line results.");
   System.out.print("Enter c value: ");
   int c = F1.nextInt();
   System.out.print("Enter m value: ");
   int m = F1.nextInt();
   if(m == 0)
   {
     throw new ArithmeticException("/by zero");
   }
   System.out.print("Enter the total numbers of Y: ");
   float y = F1.nextInt();
   System.out.println("The results of X values =");
   for(int i = 0; i < y ; i++)
   {
     x[j] = ((i+65)-c)/m;
     System.out.print(x[j]+" ");
     j++;
  }
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
    System.out.println("\nProgram has some problem with: " + e);
   }
   catch(Exception e3)
   {
     System.out.println("\nProgram has some problem with: " + e3);
   }
  }
}