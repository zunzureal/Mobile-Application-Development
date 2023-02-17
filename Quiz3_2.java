import java.util.Random;
import java.util.Scanner;
class Quiz3_2{
  public static void main(String[] args){
    int m , n , i , j , sum = 0, negative = 0,odd = 0,our = 0;
    Scanner sc1 = new Scanner(System.in);
    Random sc2 = new Random();
    System.out.printf("Enter number of rows : ");
    m = sc1.nextInt();
    System.out.printf("Enter number of columns : ");
    n = sc1.nextInt();
    int max = 1250;
    int min = -1750;
    for(i=0 ; i<m ; i++){
      for(j=0 ; j<n ; j++){
    int gen = sc2.nextInt(max-min) + min ;
    System.out.printf("%d ",gen);
    if(gen < 0){
        negative++;
      }
    else if(gen%2 == 1){
        odd++;
      }
    else if((gen%2 == 0 && gen>0))
    {
        our++;
      }
    sum = sum + gen;
      }
    System.out.printf("\n");
    }
    System.out.println("The total number of all negative numbers is "+ negative);
    System.out.println("The total number of all odd numbers is "+ odd);
    System.out.println("The total number of all our numbers is "+ our);
    System.out.println("The sum of our number in the " + m + "X" + n + " matrix is " + sum);
    }
 }
