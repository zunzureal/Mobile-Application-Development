import java.util.Scanner;
public class quizzex6_2{
    public static void main(String[]args){
        int [] number = new int[10];
        int sum=0,mt=0;
        double average;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter all numbers: ");
        for(int i=0;i<number.length;i++){
            number[i] = sn.nextInt();
            sum += number[i];
        }
        average = (double)sum/number.length;
        for(int j=0;j<number.length;j++){
            if(number[j]>average){
                mt++;
            }
        }
        System.out.println("The average is "+average);
        System.out.print("The number of values more than the average is "+mt);
    }
}