import javax.swing.JOptionPane;
class Assignment6 {
  public static void main(String[] args) {
        final double pi = 3.14;
        String radiusinput = JOptionPane.showInputDialog("Enter the radius of a cylinder:");
        double radius = Double.parseDouble(radiusinput);
        String lenghtinput = JOptionPane.showInputDialog("Enter the radius of a lenght:");
        double lenght = Double.parseDouble(lenghtinput);
        double area = radius * radius * pi;
        double volume = area * lenght;
        JOptionPane.showMessageDialog(null,"The area is " + (float)area);
        JOptionPane.showMessageDialog(null,"The volume of the cylinder is " + (float)volume); 
  }
}