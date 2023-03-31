import java.util.Scanner;

public class Ex7_1
{
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your message : ");
     String Ms = input.nextLine();
     
     if(Ms.charAt(0) == 'e' || Ms.charAt(1) == 'e' ||Ms.charAt(1) == 'e')
     {
      System.out.println("true"); 
     }else
     {
       System.out.println("false"); 
     }
  }
}