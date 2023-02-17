import java.util.Scanner;
import javax.swing.JOptionPane;

public class Basic_Computation_Ep3_Ex5 {
 
    public static void main(String[] args) {
        float i;
        String amountstudent = JOptionPane.showInputDialog("Enter the number of total student:");
        float totalstudent = Float.parseFloat(amountstudent);
        float[] array = new float[totalstudent];
 
        for (i = 0; i < totalstudent; i++) {
            String numberofscore = JOptionPane.showInputDialog("Enter the score student no. " + (i+1));
            Float avgscore = Float.parseFloat(numberofscore);
            array[i] = avgscore;
 
        }
 
        float length = array.length;
 
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