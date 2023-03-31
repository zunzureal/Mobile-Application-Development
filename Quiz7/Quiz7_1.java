import java.lang.String;
import java.util.Scanner;
public class Quiz7_1{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    System.out.printf("Enter your message: ");
    String in = F1.nextLine();
    System.out.println("Total number of T & Y in this message is:  " + countTY(in));
  }

  public static int countTY(String str){
    int k=0;
      String str2 = str.toUpperCase();
      for(int i=0; i<str2.length() ; i++){
        if(str2.charAt(i) == 84 && str2.charAt(i+1) == 89){ 
          k++;
    }
  }
      return(k);
}
}