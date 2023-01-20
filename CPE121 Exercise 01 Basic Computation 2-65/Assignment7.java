import javax.swing.JOptionPane;
class Assignment7 {
  public static void main(String[] args) {
        String poundinput = JOptionPane.showInputDialog("Enter a number in pound:");
        double pound = Double.parseDouble(poundinput);
        double kilograms = pound * 0.454;
        JOptionPane.showMessageDialog(null,"It is " + kilograms + " kilograms");
     }
}