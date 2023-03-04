import java.util.Scanner;
import java.util.Random;

public class Excersice6_1 {
    public static void main(String[] args)
    {
        int i;
        int min = 0;
        int max = 99;
        double stackdata = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array size :");
        int size = sc.nextInt();
        double[] array = new double[size];
        System.out.println("Your array:\n");
        Random rand = new Random();
        System.out.print("{ ");
        for(i=0;i<size;i++) {
            int randomNum = rand.nextInt((max - min) + 1) + min;
            System.out.print(randomNum + " ");
            array[i] = randomNum;
            stackdata = stackdata + array[i];
        }
        System.out.print("}");
        if((stackdata % 7) == 0)
        {
            System.out.print("\nYour array scores: 2");
        }
        else if(((stackdata % 4) == 0) || ((stackdata % 9)==0))
        {
            System.out.print("\nYour array scores: 1");
        }
        else
        {
            System.out.print("\nYour array scores: 0");
        }
    }
}
