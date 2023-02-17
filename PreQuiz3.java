import java.util.Scanner;
public class PreQuiz3{
  public static void main(String[] args){
    Scanner Q3 = new Scanner(System.in);
    Boolean o = true;
    double T = 0 , preT = 0 ;
    int i ;
    double n = 0 ;
      System.out.printf("Enter n : ");
      n = Q3.nextDouble();
      if(n%2 != 0){
        System.out.println("END OF THE PROGRAM");
      }
      else{ 
        for(i=0 ; i<=n ; i++){
        preT = preT + (Math.pow(-1,i+1) / ((2*i)-1));
        if(i%50 == 0 && i != 0){
        T = preT*4;
           System.out.println("T" + i + " = " + T );
        }
        }
      }
      }
  }
