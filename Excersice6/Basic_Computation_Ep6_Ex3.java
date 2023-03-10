import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Basic_Computation_Ep6_Ex3{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    Random R1 = new Random();
    int i;
    double[] array = new double[10];
    System.out.printf("Enter ten numbers: ");
    for(i=0 ; i<10 ; i++){
      array[i] = F1.nextDouble();
    }
    System.out.printf("\n The index of the min is " + indexOfSmallestElement(array));
  }

  public static int indexOfSmallestElement(double[] array){
    int i;
    double[] b = new double[10];
    for(i=0 ; i<10 ; i++){
      b[i] = array[i];
    }
    Arrays.sort(b);
    for(i=0 ; i<10 ; i++){
      System.out.printf(" " + b[i] + " ");
    }
    System.out.printf("\n");
    for(i=0 ; i<10 ; i++){
      System.out.printf(" " + array[i] + " ");
    }
    double min = b[0];
    for(i=0 ; i<10 ; i++){
      if(array[i] == b[0]){
        break;
      }
    }
    return(i);
  }
}
