import java.util.Scanner;
import javax.swing.JOptionPane;
public class Basic_Computation_Ep3_Ex4{
  public static void main(String[] args){
    int n ;
    double a , x , p ;
    Scanner P4 = new Scanner(System.in);
    System.out.printf("Enter a, x, n: ");
    a = P4.nextDouble();
    x = P4.nextDouble();
    n = P4.nextInt();
    switch(n){
      case(0):
        p = a * (1);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + ",x = " + x + ", n = " + n + " is " + p );
        break;
      case(1):
        p = a * (x);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + ",x = " + x + ", n = " + n + " is " + p );
        break;
      case(2):
        p = a * (x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + ",x = " + x + ", n = " + n + " is " + p );
        break;
      case(3):
        p = a * (x*x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + ",x = " + x + ", n = " + n + " is " + p );
        break;
      case(4):
        p = a * (x*x*x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + ",x = " + x + ", n = " + n + " is " + p );
        break;  
      case(5):
        p = a * (x*x*x*x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + ",x = " + x + ", n = " + n + " is " + p );
        break;   
      default:
        break;
    }
  }
 }