import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;
public class Excersice6_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        double stackdata = 0 , frequenty;
        int min = 0;
        int max = 9;
        System.out.print("Enter your array: ");
        int size = sc.nextInt();
        double[] array = new double[size];
        Random rand = new Random();
        for(i=0;i<size;i++)
        {
            System.out.print("\nEnter your number "+ (i+1) + " :");
            int number = sc.nextInt();
            stackdata = array[i];
        }
        for(i=0;i<=size;i++)
        {
            int randomNum = rand.nextInt((max - min) + 1) + min;
            System.out.print(randomNum + " ");
            if(stackdata == randomNum)
            {
                frequenty = array[i];
            }
        }
        //System.out.println("\nFrequenty :"+ frequenty);
        System.out.println();
    }
}
