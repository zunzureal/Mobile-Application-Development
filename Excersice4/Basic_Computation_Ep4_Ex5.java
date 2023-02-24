import java.util.Scanner;
public class Basic_Computation_Ep4_Ex5{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        int num = M1.nextInt();
        System.out.println(megalodon.reverse(num));
  }
}

class megalodon{
  public static int reverse(int number){
    int d1 , d2 , d3 , d4 , dall;
    d1 = number % 10 * 1000;
    d2 = number / 10 % 10 *100;
    d3 = number / 100 % 10 *10;
    d4 = number / 1000 % 10*1;
    dall = d1 + d2 + d3 + d4;
    return(dall);
  }
}