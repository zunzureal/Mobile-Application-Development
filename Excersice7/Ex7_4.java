import java.util.Scanner;

public class Ex7_4
{
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     String Ms = new String(input.nextLine());
     System.out.println(sumNumber(Ms));
  }
  
  public static int sumNumber(String str)
  {
    int tmp2_int = 0,sum = 0;
    int n = str.length();
    for(int i = 0 ; i < str.length() ; ++i)
    {
     
      if(Character.isDigit(str.charAt(i)))
      {
        System.out.println(i);
        System.out.println(Character.isDigit(n));
        
        
        tmp2_int = tmp2_int*10 + (str.charAt(i) - '0');
        
        if(i == (str.length()-1) && tmp2_int != 0)
        {
          //System.out.println("just do it");
          sum = sum + tmp2_int;
          tmp2_int = 0;
        }
        
      }else
      {
        sum = sum + tmp2_int;
        tmp2_int = 0;
      }
     
    }
    return sum;
  }//kdo74lnij3ok8
}