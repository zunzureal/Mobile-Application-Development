import java.util.Scanner;
public class Basic_Computation_Ep4_Ex4{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = M1.nextInt();
    System.out.println("The sum of digits for " + num + " is " + tank.sumDigits(num));
  }
}

class tank{
  public static int sumDigits(int n){
    int d1 , d2 , d3 , dall;
    d1 = n % 10;
    d2 = n / 10 % 10;
    d3 = n / 100 % 10;
    dall = d1 + d2 + d3 ;
  return(dall);
  }
}