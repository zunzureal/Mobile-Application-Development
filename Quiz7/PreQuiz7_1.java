import java.lang.String;
import java.util.Scanner;
class PreQuiz7_1{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    System.out.printf("Enter your message: ");
    String in = F1.nextLine();
    System.out.println("The number of vowels is  " + countVowels(in));
  }

  public static int countVowels(String str){
    int k=0;
      String str2 = str.toUpperCase();
      for(int i=0; i<str2.length() ; i++){
      if(str2.charAt(i) == 65) k++;
      else if(str2.charAt(i) == 69) k++;
      else if(str2.charAt(i) == 73) k++; 
      else if(str2.charAt(i) == 79) k++;
      else if(str2.charAt(i) == 85) k++;
    }
    return(k);
  }
}