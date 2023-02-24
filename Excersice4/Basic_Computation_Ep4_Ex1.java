import java.util.Scanner;
public class Basic_Computation_Ep4_Ex1{
  public static void main(String[] args){
    Scanner M1 = new Scanner(System.in);
        System.out.printf("Enter 3 number : ");
    int a = M1.nextInt();
    int b = M1.nextInt();
    int c = M1.nextInt();
    ovaltin UAV = new ovaltin();
    System.out.println(UAV.mailo(a,b,c));
  }
}

class ovaltin{
  public Boolean mailo(int a,int b,int c){
    if((a>b && a>c) || (c<a && c<b))
    {
    return(true);
    }
    else if((a>b && a>c) && (c<a && c<b))
    {
    return(false);
    }
    else
    {
    return(false);
    }
  }
}
