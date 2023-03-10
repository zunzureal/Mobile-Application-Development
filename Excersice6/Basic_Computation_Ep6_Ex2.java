import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Basic_Computation_Ep6_Ex2{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    Random R1 = new Random();
    System.out.printf("Enter the number of array size: ");
    int size = F1.nextInt();
    int[] number = new int[4];
    int[] array = new int[size];
    int i;
    for(i=0 ; i<4 ; i++){
      System.out.printf("Your number " + (i+1) + ":");
      number[i] = F1.nextInt();
    }
    System.out.printf("Your array {");
    for(i=0 ; i<size ; i++){
      array[i] = R1.nextInt(9);
      System.out.printf(" " + array[i] + " ");
    }
    System.out.printf("}");
    System.out.println("MaxFrequency " + Anisphia(array,number));
  }

  
  public static int Anisphia(int[] a,int[] num){
    int i,j;
    int[] score = new int[4];
    for(i=0 ; i<num.length ; i++){
      for(j=0 ; j<a.length ; j++){
        if(num[i] == a[j]){
          score[i]++;
        }
      }
    }
    Arrays.sort(score);    
    System.out.printf("\n Your array {");
    for(i=0 ; i<4 ; i++){
      System.out.printf(" " + score[i] + " ");
    }
    System.out.printf("} \n");
    return(score[3]);
  }
}