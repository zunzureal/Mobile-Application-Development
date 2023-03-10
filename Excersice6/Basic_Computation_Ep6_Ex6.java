import java.util.Scanner;
import java.util.Random;
public class Basic_Computation_Ep6_Ex6{
  public static void main(String[] args){
    Scanner F1 = new Scanner(System.in);
    Random R1 = new Random();
    Double[][] a = new Double[3][3];
    Double[][] b = new Double[3][3];
    Double[][] c = new Double[3][3];
    int i,j ; 
    System.out.printf("Enter matrix1 : ");
    for(i=0 ; i<3 ; i++){
      for(j=0 ; j<3 ; j++){
        a[i][j] = F1.nextDouble();
      }
    }
    System.out.printf("Enter matrix2 : ");
    for(i=0 ; i<3 ; i++){
      for(j=0 ; j<3 ; j++){
        b[i][j] = F1.nextDouble();
      }    
    }
    c = multiplyMatrix(a,b);
    System.out.println("The multiplication of the matrices is");
    for(i=0 ; i<3 ; i++){
      System.out.printf(a[0][i] + " ");
    }
    System.out.printf("\t");
    for(i=0 ; i<3 ; i++){
      System.out.printf(b[0][i] + " ");
    }
    System.out.printf("\t");
    for(i=0 ; i<3 ; i++){
      System.out.printf(c[0][i] + " ");
    }
    System.out.printf("\n");        //2nd
    for(i=0 ; i<3 ; i++){
      System.out.printf(a[1][i] + " ");
    }
    System.out.printf(" *  ");
    for(i=0 ; i<3 ; i++){
      System.out.printf(b[1][i] + " ");
    }
    System.out.printf(" =  ");
    for(i=0 ; i<3 ; i++){
      System.out.printf(c[1][i] + " ");
    }    
    System.out.printf("\n");        //3nd
    for(i=0 ; i<3 ; i++){
      System.out.printf(a[2][i] + " ");
    }
    System.out.printf("\t");
    for(i=0 ; i<3 ; i++){
      System.out.printf(b[2][i] + " ");
    }
    System.out.printf("\t");
    for(i=0 ; i<3 ; i++){
      System.out.printf(c[2][i] + " ");
    }      
  
  }
  
public static Double[][] multiplyMatrix(Double[][] a,Double[][] b){
    int i,j;
    Double[][] c = new Double[3][3];
    for(i=0 ; i<3 ; i++){
      for(j=0 ; j<3 ; j++){
      c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
      }
    }
    return(c);
}
 }