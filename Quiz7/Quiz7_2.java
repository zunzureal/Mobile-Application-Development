import java.lang.String;
import java.util.Scanner;
public class Quiz7_2{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    System.out.printf("Enter your favorite number: ");
    String ch2 = F1.nextLine();
    char ch3 = ch2.charAt(0);
    System.out.printf("Enter your message: ");
    String in = F1.nextLine();
    countFavoriteDigits(ch3,in);
  }

  public static void countFavoriteDigits(char ch,String str){
    int digit = 0;
    int number = 0;
    int sum = 0;
    for(int i=0 ; i<str.length() ; i++){
      if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
      {
        digit++;
        if(str.charAt(i) == ch){
        sum++;
        }
    }
    }
    System.out.printf("Total numbers in this message are: " + digit + "\n");
    System.out.printf("Total your favorite number in this message: " + sum + "\n");
  }
}