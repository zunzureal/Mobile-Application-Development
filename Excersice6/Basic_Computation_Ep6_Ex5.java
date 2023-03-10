import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Basic_Computation_Ep6_Ex5{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    int[] array = new int[5];
    int i;
    for(i=0 ; i<5 ; i++){
      System.out.println("Read a number: ");
      array[i] = F1.nextInt();      
    }
    Euphyllia(array);
  }

  public static void Euphyllia(int[] a){
    int i, j, l=0;
    Random R1 = new Random();
    int[] k = new int[5];
    Arrays.fill(k,99);
    for(i=0 ; i<a.length ; i++){
      k[i] = R1.nextInt(4);
      for(j=0 ; j<5 ; j++){
          while(k[i] == k[j]){
          k[i] = R1.nextInt(4);
          }
          l = k[i];
          System.out.println(a[l]);
      }
    }
  }
}