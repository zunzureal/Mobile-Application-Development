import java.util.Random;
import java.util.Scanner;
public class PreQuiz3B{
  public static void main(String[] args){
    int row , col , i , j , fivesix = 0 , threeeight = 0 , sum = 0 ;
    Scanner Q3 = new Scanner(System.in);
    Random R3 = new Random();
    System.out.printf("Enter number of rows : ");
    row = Q3.nextInt();
    System.out.printf("Enter number of columns : ");
    col = Q3.nextInt();
    int max = 1500;
    int min = -2500;
    for(i=0 ; i<row ; i++){
      for(j=0 ; j<col ; j++){
    int gen = R3.nextInt(max-min) + min ;
    System.out.printf("%d ",gen);
    if((gen % 5 == 0) && (gen % 6 == 0)){
      fivesix++;
    }
    else if((gen % 3 ==0) && (gen % 8 == 0)){
      threeeight++;
      }
    sum = sum + gen;
      }
    System.out.printf("\n");
    }
    System.out.println("The sum of our number in the " + row + "X" + col + " matrix is " + sum);
    System.out.println("The total number of numbers divisible by both 5 and 6 is " + fivesix);
    System.out.println("The total number of numbers divisible by both 3 and 8 is " + threeeight);
    }
}
