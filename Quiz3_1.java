import java.util.Scanner;

public class Quiz3_1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double T = 0 , solution = 0 ;
    int i ;
    double n = 0 ;
      System.out.printf("Enter n : ");
      n = sc.nextDouble();
      if((n/2 != 0) == (n/7 != 0))
      {
        for(i = 0 ; i <= n ; i++)
        {
          solution = solution + (i / (i + 2)) + (2*i + 2);
          if(i%40 == 0 && i != 0){
           System.out.println("T in " + i + " is " + solution );
        }
        }
      }
  }
}
    
    
