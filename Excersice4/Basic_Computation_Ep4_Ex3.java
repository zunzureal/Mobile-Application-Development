import java.util.Scanner;
public class Basic_Computation_Ep4_Ex3{
  public static void main(String[] args){
        Scanner M1 = new Scanner(System.in);
        int i = 1 , j ;
        System.out.println("i\tm(i)");
        for(j=0 ; j<=9 ; j++)
        {
          System.out.println(i + "\t" + Malee.m(i));
          i = i + 100;
        }
        
  }
}
        
class Malee {
  public static double m(int i){
      double s = 0 , n = 0 , m = 0 , k = 0 , l=1 ;
      int j = 0;       
    for(j=0;j<i;j++)
              {
               s = Math.pow(-1,l+1);
               m = (2*l)-1;
               k = k + s/m;
               l++;
               }
         n =  k * 4;
    return(n);
  }
}