import java.util.Scanner;
public class Basic_Computation_Ep3_Ex3{
  public static void main(String[] args){
    Scanner P1 = new Scanner(System.in);
    int i , j , k , p , s , l , h , m , n;
    k = 1;
    p = 0;
    System.out.printf("How many line that you want to create : ");
    m = P1.nextInt();
    for(i=0 ; i<=m ; i++){
      for(s = m+1 ; s >= i ; s--){
        System.out.printf("  ");
        for(l=s ; l>=s ; l--){
          System.out.printf(" ");
        
        } 
      }  
      
      for(j=0 ; j<k ; j++){
        if(p==0){
          System.out.printf(" ");
        }         
        else if((p<=3) && (p>0)){
          System.out.printf(" ");
        }        
        else if((p<=8) && (p>3)){
          System.out.printf(" ");
        }
        System.out.printf((p+1) + " ");
        p = p + 1; 
      }
    k = k + 2 ;
    System.out.printf("\n");
    }
  }
}
