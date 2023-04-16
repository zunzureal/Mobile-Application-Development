import java.util.Scanner;
import java.util.Arrays;
public class newz {
    public static void main(String[] args)
    {
        int i,j;
        double a = 0;
        int inputnumber;
        System.out.println("Enter number of your order: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double[] array = new double[11];
        System.out.print("Enter ten numbers: ");
        //System.out.print(number.length);
        for(i=0;i<10;i++){
            array[i] = input.nextInt();
        }
        for(i=0;i<10;i++){
            Arrays.sort(array);
            System.out.print(array[i]);
        }
        if(array[i]<array[num])
        {
            array[i] = a;
        }
    }
}
