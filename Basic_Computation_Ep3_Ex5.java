import java.util.Scanner;
import javax.swing.JOptionPane;

public class Basic_Computation_Ep3_Ex5 {
 
    public static void main(String[] args) {
        int i;
        String amountstudent = JOptionPane.showInputDialog("Enter the number of total student:");
        int totalstudent = Integer.parseInt(amountstudent);
        int[] array = new int[totalstudent];
 
        for (i = 0; i < totalstudent; i++) {
            String numberofscore = JOptionPane.showInputDialog("Enter the score student no. " + (i+1));
            float avgscore = Float.parseFloat(numberofscore);
            array[i] = (int) avgscore;
 
        }
 
        float length = array.length;
        System.out.print(length);
        float sum = 0;
 
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
        double variance = sum / 5;
        double SD = Math.sqrt(variance);
        JOptionPane.showMessageDialog(null, "Mean value of student score : " + average);
        JOptionPane.showMessageDialog(null, "Mean value of student score : " + SD);
    }
}