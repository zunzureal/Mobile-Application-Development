import java.util.Scanner;

public class Ex7_3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String Ms = new String();
    Ms = input.nextLine();
    int n = Ms.length();
    String Ms_comp = new String(Ms.substring(n-3,n));
    Ms = Ms.substring(0,n-3);
    Ms_comp = Ms_comp.toUpperCase();
    System.out.println(Ms+Ms_comp);
  }
}