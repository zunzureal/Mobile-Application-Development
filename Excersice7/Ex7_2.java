import java.util.Scanner;

public class Ex7_2
{
  public static void main(String[] args)
  {
  
     String Ms = new String();
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your message : ");
     Ms = input.nextLine();
     char ch1 = Ms.charAt(0);
     char ch2 = Ms.charAt(1);
     Ms = Ms.substring(2,Ms.length());;
     System.out.println(Ms);
     System.out.println(Ms+ch1+ch2);
     
     
  }
  
  
}