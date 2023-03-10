import java.util.Scanner;
import java.util.Random;
public class Basic_Computation_Ep6_Ex1{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    Random R1 = new Random();
    System.out.println("Enter the number of array size : ");
    int size = F1.nextInt();
    int[] array = new int[size];
    int i;
    for(i=0 ; i<size ; i++){
      array[i] = R1.nextInt(99);
    }
    System.out.println("Your array :");
    System.out.printf("{");
    for(i=0 ; i<size ; i++){
      System.out.printf(" " + array[i] + " ");
    }  
    System.out.printf("} \n");
    System.out.println("Your array scores: " + calculation(array));
  }



public static int calculation(int[] a){
  int i , score = 0 ,n;
  for(i=0 ; i<a.length ; i++){
    if(((a[i] % 10) == 4) || ((a[i] % 10) == 9)){
      score++;
      if((a[i] / 7) == 1){
        score++;
      }
    }
  }
  return(score);
}
}