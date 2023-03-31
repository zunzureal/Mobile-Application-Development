import java.lang.String;
import java.util.Scanner;
public class PreQuiz7_2{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    System.out.printf("Enter a string: ");
    String in = F1.nextLine();
    sumOddDigits(in);
  }

  public static void sumOddDigits(String str){
    int digit = 0;
    int number = 0;
    int sum = 0;
    for(int i=0 ; i<str.length() ; i++){
      if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
      {
        digit++;
        char c = str.charAt(i);
        number = (int)(c - '0');
        if(number % 2 != 0)
        {
        sum = sum + number;
        }
        }
    }
    System.out.printf("Total digits are: " + digit + "\n");
    System.out.printf("The summation of odd digits in this message is: " + sum + "\n");
  }
}

    